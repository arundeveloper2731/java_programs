package com.product.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.product.demo.model.Product;

@Repository
public class ProductRepository {
    
    private List<Product> products = new ArrayList<>();

    public void save(Product product){
        products.add(product);
    }

    public List<Product> finAll()
    {
        return products;
    }

    public Product findById(int id)
    {

        for(Product p : products)
        {
            if(p.getId() == id)
            {
                return p;
            }
        }
        return null;
    }

    public void update(Product product)
    {
        for(Product p:products)
        {
            if(p.getId() == product.getId())
            {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
            }
        }
    }


}
