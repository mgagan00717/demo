package com.example.Myapp.controller;

import com.example.Myapp.model.Product;
import com.example.Myapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductID(@PathVariable int id) {
        return productService.getprod(id);
    }

    @PostMapping("/addproduct")
    public void  addProduct(@RequestBody Product product) {
        System.out.println(product);
        productService.addProduct(product);
    }

    @PutMapping("/update")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);

    }

    @DeleteMapping("/delete")
    public void deleteProduct(@RequestBody Product product) {
        productService.deleteProduct(product);
    }

    @DeleteMapping("/delete/{id}")
   public void deleteProductID(@PathVariable int id) {
    productService.deleteProductById(id);
    }
}

