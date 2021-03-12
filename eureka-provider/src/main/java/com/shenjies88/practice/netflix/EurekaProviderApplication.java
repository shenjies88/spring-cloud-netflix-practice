package com.shenjies88.practice.netflix;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenjies88
 * @since 2021/2/4-10:13 PM
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }

    @GetMapping("/hello-word")
    public String home() {
        return "Provider Hello world";
    }

    @SneakyThrows
    @GetMapping("/fallback")
    public String fallback() {
        Thread.sleep(1000 * 100);
        return "成功";
    }
}
