package com.example.producttestcase4.controller;

import com.example.producttestcase4.model.Category;
import com.example.producttestcase4.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryAPI {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public List<Category> getall(){

        return categoryService.getall();
    }

}
