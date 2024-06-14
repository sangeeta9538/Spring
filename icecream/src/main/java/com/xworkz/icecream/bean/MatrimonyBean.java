package com.xworkz.icecream.bean;

import com.xworkz.icecream.dto.MatrimonyDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MatrimonyBean {

    public MatrimonyBean(){
        System.out.println("running in MatrimonyBean ");
    }

    @PostMapping("/go")
    public String run(MatrimonyDTO matrimonydto){
        System.out.println(" running MatrimonyBean method"+ matrimonydto);
        return "Matrimony"; // na need of .jsp extension as we have SetSufix ViewResolver for all jsp files
    }

}
