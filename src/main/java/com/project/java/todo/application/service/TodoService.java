package com.project.java.todo.application.service;

import com.project.java.todo.domain.model.Todo;
import com.project.java.todo.infrastructure.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    public Optional<Todo> getTodo(Long id) {
        return todoRepository.findById(id);
    }

    public ResponseEntity<Todo> createTodo(Todo todo) {
        return ResponseEntity.ok(todoRepository.save(todo));
    }

    public ResponseEntity<Todo> updateTodo(Long id, Todo todo) {
        todo.setId(id);
        return ResponseEntity.ok(todoRepository.save(todo));

    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
