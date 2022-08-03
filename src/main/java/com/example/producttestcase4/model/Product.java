package com.example.producttestcase4.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    private long id;
    private String name;
    @ManyToOne
    private Category category;
    private double price;
    private String img;
    private String displayy;
    private String hedieuhanh;
    private String camerasau;
    private String cameratruoc;
    private String memory;
    private String ram;
    private String cpu;
    private String memoryStick;
    private String pin;
    private int star;
}
