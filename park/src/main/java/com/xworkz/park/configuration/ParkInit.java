package com.xworkz.park.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ParkInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    public ParkInit() {
        System.out.println("Created ParkInit");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Running in getRootConfigClasses");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Running in getServletConfigClasses");
        return new Class[]{ParkConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Running in getServletMappings");
        return new String[]{"/"};
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
        configurer.enable();
    }
}
