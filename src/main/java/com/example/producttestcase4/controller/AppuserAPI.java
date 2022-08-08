package com.example.producttestcase4.controller;

import com.example.producttestcase4.model.AppUser;
import com.example.producttestcase4.model.UserSum;
import com.example.producttestcase4.service.AppUserService;
import com.example.producttestcase4.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/userapi")
public class AppuserAPI  {
    @Autowired
    AppUserService appUserService;
    @Autowired
    OrderService orderService;

    @GetMapping
    public List<AppUser> getall(){
        return appUserService.getAll();
    }

    @GetMapping("/name")
    public List<UserSum> getname(){
        return orderService.getname();
    }

}
