package br.com.fiap.driven.repository;
import br.com.fiap.driven.entities.Product;
import br.com.fiap.driven.enums.CategoryProduct;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Product findById(int id);
    List<Product> findByCategory(CategoryProduct categoryProduct);
    void deleteById(int id);
    List<Product> findAllProducts();
}
