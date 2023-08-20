package com.example.eCommerceDb.Controller;

import com.example.eCommerceDb.Entity.Product;
import com.example.eCommerceDb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/products")
    public List<Product> getAllProducts(){
        System.out.println("Ramez Checking product info is getting passed get list");
        return productService.getAllProducts();
    }

    @PostMapping("/product")
    public Product createProduct(Product product){
        System.out.println("Ramez Checking product info is getting passed");
        return productService.saveProduct(product);
    }
}
