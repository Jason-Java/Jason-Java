package org.example;

import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;
import org.example.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //注册容器的关闭钩子，位置可以随意放置
        // 载虚拟机关闭之前会先关闭context的
        // 效果和 context.close()方法一样，但是close() 方法比较暴力
        context.registerShutdownHook();
        BookServiceImpl bookServiceImpl = (BookServiceImpl) context.getBean("bookServiceImpl");
        BookServiceImpl bookService = context.getBean("bookServiceImpl", BookServiceImpl.class);
        bookServiceImpl.save();

    }
}