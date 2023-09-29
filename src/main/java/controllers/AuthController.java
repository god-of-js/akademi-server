package controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.UserDTO;

@RestController
public class AuthController {
    
    @PostMapping("/auth/join")
    public UserDTO createAccount(@RequestBody UserDTO userDTO) {
        return userDTO;
    }
}
