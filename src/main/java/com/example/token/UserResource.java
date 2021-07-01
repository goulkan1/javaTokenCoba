package com.example.token;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String, Object> useMap){
        String firstName = (String) useMap.get("firstName");
        String lastName = (String) useMap.get("lastName");
        String email = (String) useMap.get("email");
        String password = (String) useMap.get("password");
        return firstName + ", " + lastName + ", " + email + ", " + password;
    }


}
