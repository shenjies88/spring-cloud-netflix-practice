package com.shenjies88.practice.netflix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shenjies88
 * @since 2021/2/5-11:21 PM
 */
@FeignClient(value = "eureka-provider", fallback = EurekaProviderHystrixFallback.class)
public interface EurekaProviderClient {

    @GetMapping("/hello-word")
    String home();

    @GetMapping("/fallback")
    String fallback();
}

