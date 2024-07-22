package com.landingpage.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;
import java.util.UUID;

@Controller
@RequestMapping("/tech-tune-motors")
@RequiredArgsConstructor
public class IndexController {
   @GetMapping("/index")
    public String showIndex(Model model) {
        return "index";
    }
    @GetMapping("/contact-us")
    public String contactUs(Model model){
       return "enquiry";
    }
}
