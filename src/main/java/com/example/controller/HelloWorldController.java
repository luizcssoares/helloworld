package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 Comentario da branch AJUSTE1
*/
@Controller
public class HelloWorldController {
    @GetMapping("/")
    public String helloworld(){
        return "hello world ajuste1";
    }

}
