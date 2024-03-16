package com.project.java.todo.infrastructure.repository;

import com.project.java.todo.domain.model.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>{
}
