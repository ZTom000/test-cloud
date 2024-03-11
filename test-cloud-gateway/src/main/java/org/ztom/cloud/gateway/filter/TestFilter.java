package org.ztom.cloud.gateway.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

/**
 * @Description TODO
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/8 14:31
 */
@Slf4j
@Component
public class TestFilter implements GlobalFilter {

    @Value("${spring.security.oauth2.resourceserver.jwt.issuer-uri}")
    private String issuer;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        JwtDecoder jwtDecoder = JwtDecoders.fromIssuerLocation(issuer);
        String authorizationToken = exchange.getRequest().getHeaders().getFirst("Authorization");
        log.info("Im TestFilter, read Authorization: {}", authorizationToken.replace("Bearer ", ""));
        Jwt jwt = jwtDecoder.decode(authorizationToken.replace("Bearer ", ""));
        try {
            log.info("TestFilter get userName is {}", new ObjectMapper().writeValueAsString(jwt));
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
        }
        return chain.filter(exchange);
    }
}
