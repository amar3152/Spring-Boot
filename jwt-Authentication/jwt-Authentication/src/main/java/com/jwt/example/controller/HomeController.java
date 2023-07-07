package com.jwt.example.controller;

import com.jwt.example.model.User;
import com.jwt.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    // localhost:8081/home/
    @GetMapping("/")
    @ResponseBody
    public List<User> home(){
        return userService.getStore();
    }

    @GetMapping("/current-user")
    @ResponseBody
    public String getCurrentUserName(Principal principal){
        return principal.getName();
    }


}
