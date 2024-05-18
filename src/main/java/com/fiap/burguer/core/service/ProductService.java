package com.fiap.burguer.core.service;

import com.fiap.burguer.adapter.driven.entities.Product;
import com.fiap.burguer.adapter.driven.enums.CategoryProduct;
import com.fiap.burguer.adapter.driven.repository.ProductRepository;

import java.util.List;

public class ProductService  {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProductOrUpdate(Product product) {
        return   productRepository.save(product);
    }

    public Product findById(int id) {
        return productRepository.findById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAllProducts();
    }

    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    public List<Product> findByCategory(CategoryProduct category) {
        return productRepository.findByCategory(category);
    }
}

