package org.example;

import org.example.config.SpringConfig;
import org.example.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml.aa");
//        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml.aa");
        /*BookDaoImpl bookDao = context.getBean("BookDaoImpl", BookDaoImpl.class);
        bookDao.save();*/

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDaoImpl bookDao = context.getBean("BookDaoImpl", BookDaoImpl.class);
        bookDao.save();
        System.out.println("Hello world!");
    }
}