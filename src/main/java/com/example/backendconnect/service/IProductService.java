package com.example.backendconnect.service;

import com.example.backendconnect.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAllProduct();
    Optional<Product> findById(Long id);
    Product save(Product product);
    void remove(Long id);
}
