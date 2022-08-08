package com.example.producttestcase4.controller;
import com.example.producttestcase4.model.AppUser;
import com.example.producttestcase4.model.UserLogin;
import com.example.producttestcase4.service.AppUserService;
import com.example.producttestcase4.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping()
public class LoginService {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    AppUserService appUserService;
    @Autowired
    JwtService jwtService;

    @PostMapping("/login")
    public UserLogin login(@RequestBody AppUser appUser) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(appUser.getUserName(), appUser.getPassWord()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtService.generateTokenLogin(authentication);
        String role=appUserService.findRoleById(appUser.getUserName()).get(0);
        return new UserLogin(role,token,appUser.getUserName());
    }
    @PostMapping("/register")
    public void register(@RequestBody AppUser appUser){
        appUserService.save(appUser);
//        long iduser=appUserService.seachUserByName(appUser.getUserName());
        appUserService.setRolebyID(appUser.getId());
    }
}
