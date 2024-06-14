package com.xworkz.icecream.bean;

import com.xworkz.icecream.dto.ContactDto;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ContactBean {

    public ContactBean() {
        System.out.println("No arg constructor in ContactBean");
    }

    @PostMapping("/call")
    public String receive(ContactDto contactDto, Model model) {
        System.out.println("running in receive method"+ contactDto);
        model.addAttribute("msg", contactDto.getName()+ " thanks for contact");
        return "contact";
    }


}
