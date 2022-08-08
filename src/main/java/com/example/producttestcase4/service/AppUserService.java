package com.example.producttestcase4.service;

import com.example.producttestcase4.model.AppUser;
import com.example.producttestcase4.repository.AppUserRepo;
//import com.example.producttestcase4.repository.RoleRepo;
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
    public void setRolebyID(long id){
        appUserRepo.saveRole(id);
    }
//    public int seachUserByName(String username){
//        return appUserRepo.findidbyName(username);
//    }
public List<String> findRoleById(String username){
    return appUserRepo.findRoleById(username);
}
}
