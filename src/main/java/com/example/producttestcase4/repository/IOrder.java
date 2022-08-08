package com.example.producttestcase4.repository;

import com.example.producttestcase4.model.OrderProduct;
import com.example.producttestcase4.model.UserSum;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IOrder extends CrudRepository<OrderProduct, Long> {
    @Query(nativeQuery = true,value = "select name, sum(price_all) as sumprice from order_product group by name")
    List<UserSum> findallprice();
}
