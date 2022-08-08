package com.example.producttestcase4.repository;

import com.example.producttestcase4.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface Iproduct extends PagingAndSortingRepository<Product, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM product.product where name like concat('%',:name,'%');")
    List<Product> findAllByNameContaining(String name);
}
