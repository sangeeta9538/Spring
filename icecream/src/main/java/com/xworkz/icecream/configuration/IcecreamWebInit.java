package com.xworkz.icecream.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class IcecreamWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    public IcecreamWebInit(){
        System.out.println("no arg constructor in IcecreamWebInit");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{IcecreamWebConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
    {

        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
        configurer.enable();
    }
}
