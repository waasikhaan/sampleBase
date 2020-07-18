package com.base.samplebase.controller;


import com.base.samplebase.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/server/sample")
public class SampleController {
    @Autowired
    private SampleService sampleService;

    @GetMapping
    public String getUrl() {
        return sampleService.sampleMethod();
    }
}
