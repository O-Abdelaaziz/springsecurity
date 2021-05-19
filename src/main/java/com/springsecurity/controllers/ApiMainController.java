package com.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created 19/05/2021 - 08:12
 * @Package com.springsecurity.controllers
 * @Project springsecurity
 * @User LegendDZ
 * @Author Abdelaaziz Ouakala
 **/
@RestController
@RequestMapping("/api")
public class ApiMainController {

    @GetMapping("index")
    public String indexViewPage(){
        return "index";
    }

    @GetMapping("admin")
    public String indexAdminPage(){
        return "admin/index";
    }

    @GetMapping("management")
    public String indexManagementPage(){
        return "management/index";
    }
}
