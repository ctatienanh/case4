package com.example.producttestcase4.controller;

import com.example.producttestcase4.model.Product;
import com.example.producttestcase4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductAPI {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getall() {
        return productService.getall();
    }

    @PostMapping
    public void create(@RequestBody Product product){
        productService.create(product);
    }

    @PostMapping("/upImg")
    public String upImg(@RequestParam MultipartFile file){
        String name = file.getOriginalFilename();
        try {
            FileCopyUtils.copy(file.getBytes(),new File("/Users/TienAnh/Desktop/thi/Case4/img/" + name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "/thi/Case4/img/"+name;
    }
}
