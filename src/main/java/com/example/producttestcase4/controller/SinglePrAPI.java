package com.example.producttestcase4.controller;

import com.example.producttestcase4.model.Product;
import com.example.producttestcase4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/single")
@CrossOrigin("*")
public class SinglePrAPI {
    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public Product finnall(@PathVariable long id){
        return productService.finall(id);
    }

}
