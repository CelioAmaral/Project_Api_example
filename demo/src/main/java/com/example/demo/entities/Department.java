package com.example.demo.entities;

import lombok.Data;

@Data
public class Department {
    private Long id;
    private String name;

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
