package com.iman.springstore.service;

import com.iman.springstore.model.Product;
import com.iman.springstore.repo.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    public Product getTopic(Integer id) {
        return productRepository.findById(id).get();
    }

    public void addTopic(Product products) {
        productRepository.save(products);
    }

    public void updateTopic(Integer id, Product products) {
        productRepository.save(products);
    }

    public void deleteTopic(Integer id) {
        productRepository.deleteById(id);
    }
}
