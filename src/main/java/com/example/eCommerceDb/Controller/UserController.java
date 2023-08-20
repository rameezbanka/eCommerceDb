package com.example.eCommerceDb.Controller;

import com.example.eCommerceDb.Entity.User;
import com.example.eCommerceDb.Service.UserService;
import com.example.eCommerceDb.UserDTO.LoginDTO;
import com.example.eCommerceDb.UserDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String>registerUser(@RequestBody UserDTO userDTO){
        userService.registerUser(userDTO);
        return ResponseEntity.ok("User1 registered successfully");

    }
    @GetMapping("/user")
    public List<User> getAllusers(){
        return userService.getAllUsers();
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO){
        User authenticatedUser = userService.authenticateUSer(loginDTO);
        if(authenticatedUser != null){
            return ResponseEntity.ok(authenticatedUser);
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");
        }
    }
}
