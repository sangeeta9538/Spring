package com.xworkz.icecream.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
//@PropertySource("classpath:application.properties")

public class IcecreamWebConfiguration {

    public IcecreamWebConfiguration(){

        System.out.println("no arg constructor in IcecreamWebConfiguration");
    }

    @Bean
    public ViewResolver viewResolver(){
        System.out.println("Register in ViewResolver");
        InternalResourceViewResolver resolver=new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}

