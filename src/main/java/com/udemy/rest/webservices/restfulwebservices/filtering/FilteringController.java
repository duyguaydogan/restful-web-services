package com.udemy.rest.webservices.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean filterBean() {
        return new SomeBean("value1", "value2", "value3");
    }

    @GetMapping("/filterlist")
    public List<SomeBean> filterList(){
        return Arrays.asList(new SomeBean("value11", "value22", "value33"),
                new SomeBean("value12","value21", "value23"));
    }
}
