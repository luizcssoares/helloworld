package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 Comentario da branch AJUSTE2
*/
@Controller
public class HelloWorldController {
    @GetMapping("/")
    public String helloworld(){
        return "hello world ajuste2";
    }

}
