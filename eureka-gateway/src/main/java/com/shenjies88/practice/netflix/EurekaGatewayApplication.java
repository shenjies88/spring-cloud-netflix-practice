package com.shenjies88.practice.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shenjies88
 * @since 2021/3/12-10:28 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaGatewayApplication.class, args);
    }
}
