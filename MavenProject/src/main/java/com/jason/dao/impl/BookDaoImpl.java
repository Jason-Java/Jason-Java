package com.jason.dao.impl;

import com.jason.dao.BookDao;

public class BookDaoImpl  implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao  save.....");
    }
}
