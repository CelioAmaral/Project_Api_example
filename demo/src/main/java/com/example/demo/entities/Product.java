package com.example.demo.entities;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private Double price;

    private Department department;

    public Product(Long id, String name, Double price, Department department) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.department = department;
    }
}
