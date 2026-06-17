package com.product.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.demo.model.Product;
import com.product.demo.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    ProductRepository repository;

    public void addProduct(Product product)
    {
        repository.save(product);
    }

    public List<Product> getAllProducts()
    {
        return repository.finAll();   
    }

    public Product getProductById(int id)
    {
        return repository.findById(id);
    }

    public void updateProduct(Product product)
    {
        repository.update(product);
    }
}
