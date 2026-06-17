package com.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.demo.model.Product;
import com.product.demo.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    ProductService service;

    @PostMapping
    public String addProduct(@RequestBody Product product){

        service.addProduct(product);
        return "Product added successfully";
    }
    @PutMapping
    public String updateProduct(@RequestBody Product product) {
        service.updateProduct(product);
        
        return "Product updated successfully";
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts()
    {
        return service.getAllProducts();
    }
}
