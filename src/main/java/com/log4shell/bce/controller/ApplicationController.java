package com.log4shell.bce.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ApplicationController {
    private static final Logger logger = LogManager.getLogger(ApplicationController.class.getName());

    @GetMapping("/")
    public String index(HttpServletRequest request) {

        String apiVersion = request.getHeader("X-Api-Version");
        logger.info("API VERSION IS RECEIVED " + apiVersion);
        return "HELLO WORLD!";
    }
}
