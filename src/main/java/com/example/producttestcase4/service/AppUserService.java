package com.example.be_casemodule4.service;

import com.example.be_casemodule4.models.AppUser;
import com.example.be_casemodule4.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService implements IUserService{
    @Autowired
    AppUserRepo appUserRepo;
    @Override
    public List<AppUser> getAll() {
        return (List<AppUser>) appUserRepo.findAll();
    }

    @Override
    public void save(AppUser appUser) {
        appUserRepo.save(appUser);
    }

    @Override
    public void delete(Long id) {
        appUserRepo.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = appUserRepo.findByUserName(username);
        return new User(appUser.getUserName(),appUser.getPassWord(),appUser.getRoles());
    }
}
