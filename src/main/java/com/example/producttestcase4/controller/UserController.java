package com.example.be_casemodule4.controller;
import com.example.be_casemodule4.models.AppUser;
import com.example.be_casemodule4.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    AppUserService appUserService;

    @GetMapping
    public ResponseEntity<List<AppUser>> getAll(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return new ResponseEntity<>(appUserService.getAll(), HttpStatus.OK);
    }
}
