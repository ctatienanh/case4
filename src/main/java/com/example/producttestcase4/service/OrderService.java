package com.example.producttestcase4.service;

import com.example.producttestcase4.model.OrderProduct;
import com.example.producttestcase4.repository.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    IOrder iOrder;

    public List<OrderProduct> getall(){
        return (List<OrderProduct>) iOrder.findAll();
    }

    public void create (List<OrderProduct> orders){
        for (OrderProduct o: orders) {
            iOrder.save(o);

        }
    }


}
