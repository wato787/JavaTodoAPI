package com.project.java.todo.presentation.controller;

import com.project.java.todo.application.service.TodoService;
import com.project.java.todo.domain.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return todoService.getTodos();
    }

    @GetMapping("/todo/{id}")
    public Optional<Todo> getTodo(
            @PathVariable("id") Long id
    ) {
        return todoService.getTodo(id);
    }

    @PostMapping("/todo")
    public ResponseEntity<Todo> createTodo(
            @RequestBody String title
    ) {
        return todoService.createTodo(title);
    }

    @PutMapping("/todo/{id}")
    public ResponseEntity<Todo> updateTodo(
            @PathVariable("id") Long id,
            @RequestBody Todo todo
    ) {
        return todoService.updateTodo(id, todo);
    }

    @DeleteMapping("/todo/{id}")
    public void deleteTodo(
            @PathVariable("id") Long id
    ) {
        todoService.deleteTodo(id);

    }


}
