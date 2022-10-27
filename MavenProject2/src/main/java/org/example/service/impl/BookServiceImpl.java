package org.example.service.impl;


import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void save() {
        System.out.println("book service save ...");
        System.out.println("我是占位符name  "+name);
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(list);
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(map.get(s));

        }

    }

    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }






    private List<String> list;
    private String [] array;
    private Map<String,String> map;

    public void setList(List list) {
        this.list = list;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
