package com.example.producttestcase4.controller;

import com.example.producttestcase4.model.OrderProduct;
import com.example.producttestcase4.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class OrderAPI {
    @Autowired
    OrderService orderService;


    @GetMapping
    public List<OrderProduct> gelall(){
        return orderService.getall();
    }

    @PostMapping
    public void  create(@RequestBody List<OrderProduct> orders){
        orderService.create(orders);
    }


}
