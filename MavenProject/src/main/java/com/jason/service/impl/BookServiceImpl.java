package com.jason.service.impl;

import com.jason.dao.BookDao;
import com.jason.dao.impl.BookDaoImpl;
import com.jason.service.BookService;

public class BookServiceImpl implements BookService {

    public BookServiceImpl(int i, String value) {
        System.out.println("我是参数 i " + i + "  我是参数 value  " + value);

    }
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save.....");
        bookDao.save();
    }


    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
