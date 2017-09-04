package com.kryx07.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("showForm")
    public String showForm(){
        return "show-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
}
