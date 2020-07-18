package com.base.samplebase.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/server")
public class PingController {
    private static final Logger log = LoggerFactory.getLogger(PingController.class);

    @GetMapping("/ping")
    public String ping() {
        log.info("This is just a test");
        return "pong";
    }

}
