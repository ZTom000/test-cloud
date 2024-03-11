package org.ztom.cloud.gateway.filter;


import com.alibaba.nacos.shaded.com.google.gson.JsonObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;

import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

/**
 * @Description TODO
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/9 9:03
 */
@Slf4j
@Component
public class TestWebFilter implements WebFilter {

    @Value("${spring.security.oauth2.resourceserver.jwt.issuer-uri}")
    private String issuer;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {

        JwtDecoder jwtDecoder = JwtDecoders.fromIssuerLocation(issuer);
        String authorizationToken = exchange.getRequest().getHeaders().getFirst("Authorization");
        log.info("Im TestWebFilter, read Authorization: {}", authorizationToken.replace("Bearer ", ""));
        Jwt jwt = jwtDecoder.decode(authorizationToken.replace("Bearer ", ""));
        try {
            log.info("Converter result is {}", new ObjectMapper().writeValueAsString(jwt.getClaims()));
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
        }
        return chain.filter(exchange);
    }
}
