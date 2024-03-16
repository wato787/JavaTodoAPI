package com.project.java.todo.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/todo")
    public String getTodo() {
        return "Learn Spring Boot";
    }

}
