package com.xworkz.park.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan("com.xworkz.park")
@EnableWebMvc
@PropertySource("classpath:Application.properties")
public class ParkConfiguration {
    public ParkConfiguration(){

        System.out.println("no arg constructor in ParkConfiguration");
    }

    @Bean
    public ViewResolver viewResolver(){
        System.out.println("Registered in ViewResolver");
        InternalResourceViewResolver resolver=new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
