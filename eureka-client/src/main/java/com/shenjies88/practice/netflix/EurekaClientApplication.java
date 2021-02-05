package com.shenjies88.practice.netflix;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenjies88
 * @since 2021/2/4-10:13 PM
 */
@AllArgsConstructor
@RestController
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

    private final EurekaProviderClient eurekaProviderClient;

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

    @RequestMapping("/client-hello-word")
    public String helloWorld() {
        return eurekaProviderClient.home();
    }
}
