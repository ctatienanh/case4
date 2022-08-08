package com.example.producttestcase4.controller;

import com.example.producttestcase4.model.Sales;
import com.example.producttestcase4.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
@CrossOrigin("*")
public class SalesAPI {
    @Autowired
    SalesService salesService;

    @GetMapping
    public List<Sales> getall(){
        return salesService.getall();
    }

    @PostMapping
    public void create(@RequestBody Sales sales){
        salesService.create(sales);
    }
}
