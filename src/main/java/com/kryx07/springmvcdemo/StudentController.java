package com.kryx07.springmvcdemo;

import com.kryx07.springmvcdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedHashMap;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("showForm")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @RequestMapping("processForm")
    public String processForm(@ModelAttribute Student student) {
        System.out.println("student " + student.getFirstName() + " " + student.getLastName());
        return "student-confirmation";
    }

}
