package com.example.producttestcase4.controller;

import com.example.producttestcase4.model.AppUser;
import com.example.producttestcase4.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/userapi")
public class AppuserAPI {
    @Autowired
    AppUserService appUserService;

    @GetMapping
    public List<AppUser> getall(){
        return appUserService.getAll();
    }
}
