package com.jason;

import com.jason.dao.BookDao;
import com.jason.service.BookService;
import com.jason.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*BookService service = (BookService) context.getBean("BookServiceImpl", 10, "123456");

        service.save();*/
        BookDao bookDao = (BookDao) context.getBean("BookFactory");
        bookDao.save();

    }
}
