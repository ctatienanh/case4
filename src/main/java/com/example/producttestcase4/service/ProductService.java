package com.example.producttestcase4.service;

import com.example.producttestcase4.model.Product;
import com.example.producttestcase4.repository.Iproduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    Iproduct iproduct;

    public Page<Product> getall(Pageable pageable){
        return  iproduct.findAll(pageable);
    }
    public Product finall(long id){
        return iproduct.findById(id).get();
    }
    public void create(Product product){iproduct.save(product);}
    public void delete(long id){
        iproduct.deleteById(id);
    }

}
