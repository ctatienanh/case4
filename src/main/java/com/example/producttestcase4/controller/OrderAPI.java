package com.example.producttestcase4.controller;

import com.example.producttestcase4.model.Order;
import com.example.producttestcase4.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class OrderAPI {
    @Autowired
    OrderService orderService;


    @GetMapping
    public List<Order> gelall(){
        return orderService.getall();
    }


}
