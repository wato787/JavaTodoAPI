package com.project.java.todo.domain.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String title;

    @Column(nullable = false)
    private  boolean completed = false; // デフォルト値はfalse


    @Builder
    public Todo(Long id, String title, String description, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }


}