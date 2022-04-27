package com.capstone.stech360guide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController_01 {

    @GetMapping("/")
    public String main(){

        return "cover";
    }

}