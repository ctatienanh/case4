package com.example.be_casemodule4.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String passWord;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
    private String address;
    private String phoneNumber;
    private String email;
}
