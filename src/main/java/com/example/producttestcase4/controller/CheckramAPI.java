package com.example.producttestcase4.controller;

import com.example.producttestcase4.model.Checkram;
import com.example.producttestcase4.service.CheckramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checkram")
@CrossOrigin("*")
public class CheckramAPI {
    @Autowired
    CheckramService checkramService;

    @GetMapping
   public List<Checkram> getall(){
       return checkramService.getall();
   }

   @PostMapping
    public void create(@RequestBody Checkram checkrams){
        checkramService.createcheckram(checkrams);
   }



}
