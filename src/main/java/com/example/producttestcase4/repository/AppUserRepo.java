package com.example.be_casemodule4.repository;


import com.example.be_casemodule4.models.AppUser;
import org.springframework.data.repository.CrudRepository;
public interface AppUserRepo extends CrudRepository<AppUser, Long> {
    AppUser findByUserName(String userName);
}