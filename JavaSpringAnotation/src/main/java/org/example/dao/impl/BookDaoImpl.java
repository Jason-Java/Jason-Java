package org.example.dao.impl;


import org.example.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.objenesis.instantiator.annotations.Instantiator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("BookDaoImpl")
@Lazy(true)
@Scope("singleton")

public class BookDaoImpl implements BookDao {

    @Value("${name}") //自动注入外部属性文件的值
    private String name;


   /*
    @Autowired   自动装配引用类型 按类型装配
    @@Qualifier("bookDao")  // 加上这个注解表明按照 bean的名字进行自动注入
    private BookDao bookdao；
    */
    public BookDaoImpl() {
        System.out.println("constructor");
    }

    public void save() {
        System.out.println("book dao save ..."+ name);
    }





    private void init() {
        System.out.println("init ...");
    }


    public void destroy() {
        System.out.println("destroy ...");
    }
}
