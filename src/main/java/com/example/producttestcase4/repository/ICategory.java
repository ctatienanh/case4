package com.example.producttestcase4.repository;

import com.example.producttestcase4.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategory extends CrudRepository<Category, Long> {
}
