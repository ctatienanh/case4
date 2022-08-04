package com.example.producttestcase4.repository;

import com.example.producttestcase4.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface Iproduct extends PagingAndSortingRepository<Product, Long> {

}
