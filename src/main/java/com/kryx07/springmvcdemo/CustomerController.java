package com.kryx07.springmvcdemo;

import com.kryx07.springmvcdemo.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("customer")
public class CustomerController {

    @RequestMapping("customer-form")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("There are errors!");
            return "customer-form";
        } else {
            System.out.println("There are NOOOO errors!");
            return "customer-confirmation";
        }
    }

}
