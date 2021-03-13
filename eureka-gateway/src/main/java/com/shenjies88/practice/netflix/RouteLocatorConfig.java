package com.shenjies88.practice.netflix;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shenjies88
 * @since 2021/3/13-11:51 AM
 */
@Configuration
public class RouteLocatorConfig {

    @Bean
    public RouteLocator myRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route", r -> r.path("/*")
                        .uri("lb://eureka-client"))
                .build();
    }
}
