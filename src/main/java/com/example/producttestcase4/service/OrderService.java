package com.example.producttestcase4.service;

import com.example.producttestcase4.model.Order;
import com.example.producttestcase4.repository.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    IOrder iOrder;

    public List<Order> getall(){
        return (List<Order>) iOrder.findAll();
    }


}
