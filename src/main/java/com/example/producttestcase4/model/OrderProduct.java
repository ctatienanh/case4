package com.example.producttestcase4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String nameproduct;
    private double price;
    private int amount;
    private double priceAll;
}
