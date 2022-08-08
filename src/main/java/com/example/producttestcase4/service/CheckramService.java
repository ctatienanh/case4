package com.example.producttestcase4.service;

import com.example.producttestcase4.model.Checkram;
import com.example.producttestcase4.repository.Icheckram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CheckramService {
    @Autowired
    Icheckram icheckram;

    public List<Checkram> getall(){
        return (List<Checkram>) icheckram.findAll();
    }

    public void createcheckram(Checkram checkram){
         icheckram.save(checkram);

    }
}
