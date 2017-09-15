package com.kryx07.springmvcdemo;

import com.kryx07.springmvcdemo.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
      /*  Validator validator;
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
        Set<ConstraintViolation<Customer>> constraintViolations = validator.validate(customer);

        System.out.println(constraintViolations.iterator().next().getMessage());

*/

        System.out.println(bindingResult);
        System.out.println("Last name: " + customer.getLastName());

        if (bindingResult.hasErrors()) {
            System.out.println("There are errors!");
            return "customer-form";
        } else {
            System.out.println("There are NOOOO errors!");
            return "customer-confirmation";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);;
    }

}
