package com.xworkz.icecream.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping

public class IcecreamBean {
    public IcecreamBean(){
        System.out.println("Running in IcecreamBean ");
    }

    @PostMapping ("/read")
    public String display(){
        System.out.println("IcecreamBean method");
        return "index";
    }



}
