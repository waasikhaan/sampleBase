package com.base.samplebase.service;

import com.base.samplebase.config.SampleConfiguration;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private final SampleConfiguration sampleConfiguration;

    public SampleService(SampleConfiguration sampleConfiguration) {
        this.sampleConfiguration = sampleConfiguration;
    }

    public String sampleMethod() {
        return sampleConfiguration.getUrl();
    }
}
