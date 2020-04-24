package com.przemo.aopSpringShow.controller;

import com.przemo.aopSpringShow.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    private final SimpleService simpleService;

    @Autowired
    public MainController(SimpleService ss) {
        this.simpleService = ss;
    }

    @GetMapping(path = "works")
    public String index() {
        simpleService.doServiceThings();
        return "Works!";
    }
}
