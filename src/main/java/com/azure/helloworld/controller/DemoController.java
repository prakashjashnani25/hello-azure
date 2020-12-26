package com.azure.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/greet")
    public String greet( @RequestParam("") String name){
        if(name!=null && !"".equals(name))
            return "Hello "+name+"!!!";
        else
            return "Hello Anonymous !!!!";
    }
}
