package com.example.producttestcase4.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Checkram {
    @Id
    private long id;
    private String name;
    private double price;
    private String ram;
    private String bonho;
    private long idgoc;
    private long idao;
}
