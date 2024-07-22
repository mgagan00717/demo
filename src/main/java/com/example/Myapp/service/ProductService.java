package com.example.Myapp.service;

import com.example.Myapp.model.Product;
import com.example.Myapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    public List<Product> products = new ArrayList<>(Arrays.asList(new Product(1,"iphone",5000),new Product(2,"samsung",1000),new Product(3,"motorola",5000)));

    public  List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getprod(int id){
//          return products.get(id-1);
//        return products.stream().filter(p->p.getProdId() == id).findFirst().get();
        return repo.findById(id).get();
    }

//    public void addProduct(int id , String prodName , int prodPrice ){
//        products.add(new Product(id,prodName,prodPrice));
//    }
    public void addProduct(Product p ){
//        products.add(p);
        repo.save(p);
    }

    public void updateProduct(Product product) {
//        int index=0;
//        for(Product p : products ){
//            if(p.getProdId() == product.getProdId()){
//                index = p.getProdId();
//                break;
//            }
//        }
//         index-=1;
//         products.set(index, product);
//        products.set(products.indexOf(product), product);
        repo.save(product);
    }

    public void deleteProduct(Product product) {
//        products.remove(product);
        repo.delete(product);
    }

    public void deleteProductById(int id) {
//        products.removeIf(p->p.getProdId() == id);
        repo.deleteById(id);
    }
}
