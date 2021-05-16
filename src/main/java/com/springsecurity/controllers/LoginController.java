package com.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Created 16/05/2021 - 10:19
 * @Package com.springsecurity.controllers
 * @Project springsecurity
 * @User LegendDZ
 * @Author Abdelaaziz Ouakala
 **/
@Controller
@RequestMapping("api")
public class LoginController {

    @GetMapping(path = "login")
    public String loginViewPage(){
        return "login";
    }
}
