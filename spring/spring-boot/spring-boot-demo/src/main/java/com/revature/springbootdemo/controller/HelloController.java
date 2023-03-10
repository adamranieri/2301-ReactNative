package com.revature.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

//    @GetMapping("/hello")
//    // localhost:8080/hello?msg=messagefrompostman
//    // the key that we specify in the annotation should correspond to the key in the request
//    public String message(@RequestParam("msg") String message) {
//        System.out.println(message);
//        return message;
//    }

    @GetMapping("/hello")
    public String hi() {
        return "Hi";
    }
}
