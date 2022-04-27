package com.capstone.stech360guide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController_02 {

    @GetMapping("/viewer")
    public String main(){

        return "viewer";
    }
}