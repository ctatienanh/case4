package com.example.be_casemodule4.service;
import com.example.be_casemodule4.models.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;
import java.util.List;

public interface IUserService extends UserDetailsService {
    List<AppUser> getAll();
    void save(AppUser appUser);
    void delete(Long id);
}