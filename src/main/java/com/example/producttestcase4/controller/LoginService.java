package com.example.producttestcase4.controller;
import com.example.producttestcase4.model.AppUser;
import com.example.producttestcase4.service.AppUserService;
import com.example.producttestcase4.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> login(@RequestBody AppUser appUser) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(appUser.getUserName(), appUser.getPassWord()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtService.generateTokenLogin(authentication);
        return new ResponseEntity<>(token, HttpStatus.OK);
    }
    @PostMapping("/register")
    public void register(@RequestBody AppUser appUser){
        appUserService.save(appUser);
//        long iduser=appUserService.seachUserByName(appUser.getUserName());
        appUserService.setRolebyID(appUser.getId());
    }
}
