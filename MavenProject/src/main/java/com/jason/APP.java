package com.jason;

import com.jason.service.BookService;
import com.jason.service.impl.BookServiceImpl;

public class APP {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl(1,"1234");
        bookService.save();
    }
}
