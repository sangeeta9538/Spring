package com.xworkz.icecream.bean;

import com.xworkz.icecream.dto.ContactDto;
import com.xworkz.icecream.dto.TeamDto;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")

public class TeamBean {

    public TeamBean() {
        System.out.println("No arg constructor in TeamBean");
    }

    @PostMapping("/team")
    public String receive(@Valid TeamDto teamDto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            System.err.println("DTO has invalid Data");
           bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
           model.addAttribute("errors", bindingResult.getAllErrors());
           model.addAttribute("dto", teamDto);
        } else {
            model.addAttribute("msg", "thanku for Registration " + teamDto.getTeamName());
            System.out.println(teamDto);

        }
        System.out.println("running submit of TeamRegistration");
        return "TeamRegistration";
    }
}





