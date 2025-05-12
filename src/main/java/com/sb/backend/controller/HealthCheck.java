package com.sb.backend.controller;

import com.sb.backend.BackendApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthCheck {

    static Logger logger = LoggerFactory.getLogger(HealthCheck.class);


    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/ping")
    @ResponseBody
    public String ping() {
        logger.info("Checking Health.");
        return "pong";
    }

}