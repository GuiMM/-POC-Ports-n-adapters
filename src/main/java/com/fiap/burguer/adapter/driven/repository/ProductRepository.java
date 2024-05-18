package com.fiap.burguer.adapter.driven.repository;

import com.fiap.burguer.adapter.driven.entities.Product;
import com.fiap.burguer.adapter.driven.enums.CategoryProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    Product findById(int id);
    List<Product> findByCategory(CategoryProduct categoryProduct);
    void deleteById(int id);
    List<Product> findAllProducts();
}
