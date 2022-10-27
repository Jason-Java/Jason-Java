package com.jason.dao;

import com.jason.mapper.IEmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) throws IOException {
        //加载MyBatis配置文件
        Reader reader = Resources.getResourceAsReader("config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IEmpMapper empMapper = sqlSession.getMapper(IEmpMapper.class);
        ArrayList<Emp> empArrayList = empMapper.selectAll();
        for (Emp emp : empArrayList
        ) {
            System.out.println(emp.toString());

        }
        sqlSession.close();

    }


}
