package com.mihail.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAll(){
        return "view_for_all_employees";
    }

    @GetMapping("/hr_info")
    public String getInfoForHR(){
        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public String getInfoForManager(){
        return "view_for_managers";
    }
}
