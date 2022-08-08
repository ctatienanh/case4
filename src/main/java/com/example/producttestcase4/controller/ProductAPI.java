package com.example.producttestcase4.controller;

import com.example.producttestcase4.model.Product;
import com.example.producttestcase4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    public Page<Product> getall(@RequestParam(defaultValue = "0") int page) {
        return productService.getall(PageRequest.of(page,8));
    }

    @GetMapping("/{id}")
    public Product finnall(@PathVariable long id){
        return productService.finall(id);
    }

    @PostMapping
    public void create(@RequestBody Product product){
        productService.create(product);
    }

    @PostMapping("/upImg")
    public String upImg(@RequestParam MultipartFile file){
        String name = file.getOriginalFilename();
        try {
            FileCopyUtils.copy(file.getBytes(),new File("/Users/TienAnh/Desktop/Template-phone/web bán đt/img/" + name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "/Template-phone/web bán đt/img/"+name;
    }

    @PostMapping("/edit")
    public void edit(@RequestBody Product product){
         productService.create(product);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        productService.delete(id);
    }

}
