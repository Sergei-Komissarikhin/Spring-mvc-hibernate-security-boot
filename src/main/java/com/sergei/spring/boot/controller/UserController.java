package com.sergei.spring.boot.controller;

import com.sergei.spring.boot.service.RoleService;
import com.sergei.spring.boot.service.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class UserController {
    private final UserDetailServiceImpl userService;

    @Autowired
    public UserController(UserDetailServiceImpl userService, RoleService roleService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String printWelcome() {
        return "/hello";
    }

    @GetMapping(value = "login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/logout")
    public String logoutPage(){
        return "redirect:/admin";
    }

    @GetMapping("/user/show")
    public String userShowPage(Principal principal, Model model){
        model.addAttribute("user",userService.loadUserByUsername(principal.getName()));
        return "/user/show";
    }
}