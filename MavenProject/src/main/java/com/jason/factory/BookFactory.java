package com.jason.factory;

import com.jason.dao.BookDao;
import com.jason.dao.impl.BookDaoImpl;

public class BookFactory {
    public static BookDaoImpl getBookDaoImplInstance() {
        return new BookDaoImpl();
    }
}
