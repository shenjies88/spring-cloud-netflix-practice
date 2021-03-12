package com.shenjies88.practice.netflix;

import org.springframework.stereotype.Component;

@Component
class EurekaProviderClientFallback implements EurekaProviderClient {

    @Override
    public String home() {
        return "home fallback";
    }

    @Override
    public String fallback() {
        return "fallback";
    }
}