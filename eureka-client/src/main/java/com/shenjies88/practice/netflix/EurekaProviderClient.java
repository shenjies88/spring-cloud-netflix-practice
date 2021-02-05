package com.shenjies88.practice.netflix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shenjies88
 * @since 2021/2/5-11:21 PM
 */
@RequestMapping
@FeignClient("eureka-provider")
public interface EurekaProviderClient {

    @RequestMapping("/hello-word")
    String home();
}
