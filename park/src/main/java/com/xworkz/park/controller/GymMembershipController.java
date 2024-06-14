package com.xworkz.park.controller;

import com.xworkz.park.dto.GymDto;
import com.xworkz.park.model.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;
@Controller
//@Component
@RequestMapping("/")
@EnableWebMvc
public class GymMembershipController {
    @Autowired
    private GymService gymService;

    public GymMembershipController() {

        System.out.println("No arg constructor in GymMembershipBean");
    }

    @PostMapping("/gym")
    public String receive(@Valid GymDto gymDto, BindingResult bindingResult, Model model) {

        System.out.println("Running Register to method");
        System.out.println(gymDto);

        if (bindingResult.hasErrors()) {
            System.err.println("DTO has invalid Data");
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "GymMembershipForm";
        }
        else {
            boolean validate = this.gymService.validateAndSave(gymDto);
            if (validate) {
                System.out.println("GymForm is Validated And Saved successfully in Controller" + gymDto);

            } else {
                System.out.println("GymForm is Not Validated And Saved Successfully in Controller" + gymDto);

            }
            model.addAttribute("msg", "sucessfully Saved the Data !!!! " + gymDto.getName());


        }
        //model.addAttribute("hi",gymDTO);
        return "GymMsg";



    }

}
