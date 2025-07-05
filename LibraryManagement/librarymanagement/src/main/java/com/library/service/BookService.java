package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository ;


    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayServiceMessage() {
        System.out.println("Inside BookService: Using BookRepository to fetch data...");
        bookRepository.displayRepositoryMessage();
    }
}
