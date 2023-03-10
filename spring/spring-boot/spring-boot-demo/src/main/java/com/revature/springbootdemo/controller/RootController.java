package com.revature.springbootdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @RequestMapping(method = RequestMethod.OPTIONS)
    @CrossOrigin(origins = "*")
    public String options() {
        return "Options";
    }
}
