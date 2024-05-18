package com.fiap.burguer.entities;


import com.fiap.burguer.enums.CategoryProduct;

import java.time.LocalDateTime;

public class Product {
    private int id;
    private String name;
    private CategoryProduct category;
    private double price;
    private String description;
    private LocalDateTime preparationTime;
    private String image;

    Product(int id,
            String name,
            CategoryProduct category,
            double price,
            String description,
            LocalDateTime preparationTime,
            String image) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.preparationTime = preparationTime;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryProduct getCategory() {
        return category;
    }

    public void setCategory(CategoryProduct category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(LocalDateTime preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
