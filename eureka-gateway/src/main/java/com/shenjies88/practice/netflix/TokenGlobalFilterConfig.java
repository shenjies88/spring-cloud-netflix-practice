package com.shenjies88.practice.netflix;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

/**
 * @author shenjies88
 * @since 2021/3/13-11:41 AM
 */
@Slf4j
@Configuration
public class TokenGlobalFilterConfig {

    @Bean
    public GlobalFilter tokenGlobalFilter() {
        return (exchange, chain) -> {
            HttpHeaders headers = exchange.getRequest().getHeaders();
            if (headers.containsKey("token")) {
                log.info("TokenFilter-----拦截-----有token");
            } else {
                log.info("TokenFilter-----拦截-----无token");
            }
            return chain.filter(exchange);
        };
    }
}
