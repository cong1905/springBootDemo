package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Login {
    @RequestMapping(value = {"","/login1"})
    public String login1(Model model){
        model.addAttribute("欢迎登陆111","欢迎登陆！111");
        return  "login";
    }


    @RequestMapping(value="/login2", method = RequestMethod.GET)
    public String login2(Model model){
        model.addAttribute("欢迎登陆","欢迎登陆！");
        return  "login2";
    }
}
