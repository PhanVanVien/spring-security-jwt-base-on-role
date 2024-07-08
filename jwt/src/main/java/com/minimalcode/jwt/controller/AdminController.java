package com.minimalcode.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    private final String[] bookList = {"The Lord Of The Rings", "Harry Potter"};

    @GetMapping("/books")
    private String[] getBookList() {
        return bookList;
    }
}
