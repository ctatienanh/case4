package com.example.producttestcase4.repository;

import com.example.producttestcase4.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface IOrder extends CrudRepository<Order, Long> {
}
