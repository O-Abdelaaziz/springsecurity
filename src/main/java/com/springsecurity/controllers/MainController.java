package com.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Created 16/05/2021 - 10:38
 * @Package com.springsecurity.controllers
 * @Project springsecurity
 * @User LegendDZ
 * @Author Abdelaaziz Ouakala
 **/
@Controller
@RequestMapping("api/")
public class MainController {

    @GetMapping("index")
    public String indexViewPage(){
        return "index";
    }

    @GetMapping("admin")
    public String indexAdminPage(){
        return "admin/index";
    }

    @GetMapping("profile")
    public String indexProfilePage(){
        return "profile/index";
    }

    @GetMapping("management")
    public String indexManagementPage(){
        return "management/index";
    }
}
