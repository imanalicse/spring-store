package com.iman.springstore.controller.api;

import com.iman.springstore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.iman.springstore.service.ProductService;

import java.util.List;

@RequestMapping("/api/")
@RestController

public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/products")
    public List<Product> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return products;
    }

    @GetMapping("products/{id}")
    public Product getTopic(@PathVariable Integer id) {
        Product products = productService.getTopic(id);
        return products;
    }

    @PostMapping("/products")
    public void addTopic(@RequestBody Product products) {
        productService.addTopic(products);
    }

    @PutMapping("/products/{id}")
    public void updateTopic(@RequestBody Product topicBody, @PathVariable Integer id) {
        Product products = productService.getTopic(id);
        products.setName(topicBody.getName());
        productService.updateTopic(id, products);
    }

    @DeleteMapping("products/{id}")
    public void deleteTopic(@PathVariable Integer id) {
        productService.deleteTopic(id);
    }
}
