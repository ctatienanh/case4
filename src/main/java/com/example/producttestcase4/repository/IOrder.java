package com.example.producttestcase4.repository;

import com.example.producttestcase4.model.OrderProduct;
import org.springframework.data.repository.CrudRepository;

public interface IOrder extends CrudRepository<OrderProduct, Long> {
}
