package com.example.producttestcase4.service;

import com.example.producttestcase4.model.Category;
import com.example.producttestcase4.repository.ICategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {
    @Autowired
    ICategory iCategory;

    public List<Category> getall(){
        return (List<Category>) iCategory.findAll();
    }

}
