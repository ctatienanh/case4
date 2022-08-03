package com.example.producttestcase4.service;

import com.example.producttestcase4.model.Product;
import com.example.producttestcase4.repository.Iproduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    Iproduct iproduct;
    public List<Product> getall(){
        return (List<Product>) iproduct.findAll();
    }
    public void create(Product product){iproduct.save(product);}

}
