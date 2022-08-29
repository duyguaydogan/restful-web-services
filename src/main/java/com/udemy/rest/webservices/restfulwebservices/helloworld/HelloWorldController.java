package com.udemy.rest.webservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello Ilker";
    }

    @GetMapping("/helloworldbean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/helloworldbean/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World %s",name));
    }

    @GetMapping("/helloworldInt")
    public String helloWorldInt(){

        return messageSource.getMessage("good.morning.message",null, "Default Message", LocaleContextHolder.getLocale());
    }
}
