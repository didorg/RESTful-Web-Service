package com.dido.mrws.controllers.toTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test1Controller {

    @GetMapping(value = "/t1")
    public String test1(){
        return "Hi test1";
    }

}
