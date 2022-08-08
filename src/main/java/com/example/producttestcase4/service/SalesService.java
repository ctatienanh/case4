package com.example.producttestcase4.service;

import com.example.producttestcase4.model.Sales;
import com.example.producttestcase4.repository.ISales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
    @Autowired
    ISales iSales;

    public List<Sales> getall(){
        return (List<Sales>) iSales.findAll();
    }
    public void create(Sales sales){
        iSales.save(sales);
    }

}
