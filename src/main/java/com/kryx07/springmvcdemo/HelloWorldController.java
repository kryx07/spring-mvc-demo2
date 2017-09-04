package com.kryx07.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("showForm")
    public String showForm() {
        return "show-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest httpServletRequest, Model model) {

        String name = httpServletRequest.getParameter("studentName");
        name = name.toUpperCase();

        String result = "Yo! " + name;

        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String letsShout2(@RequestParam("studentName") String studentName, Model model) {
        String name = studentName;
        name = name.toUpperCase();

        String result = "Hey My Frien from v3! " + name;

        model.addAttribute("message", result);

        return "helloworld";
    }

}
