package com.example.producttestcase4.repository;

import com.example.producttestcase4.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface Iproduct extends CrudRepository<Product, Long> {
}
