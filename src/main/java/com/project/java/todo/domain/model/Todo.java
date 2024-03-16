package com.project.java.todo.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String title;
    private String description;

    @Column(nullable = false)
    private boolean completed = false; // デフォルト値はfalse

    // titleのみを受け取るコンストラクタ
    public Todo(String title) {
        this.title = title;
    }

    // title、descriptionを受け取るコンストラクタ
    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
    }
}