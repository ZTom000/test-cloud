package org.ztom.cloud.gateway.filter;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.security.oauth2.server.resource.authentication.ReactiveJwtAuthenticationConverterAdapter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import org.ztom.cloud.gateway.config.ResourceServerConfig;
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

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        String authorizationToken = exchange.getRequest().getHeaders().getFirst("Authorization");;
        log.info("Im TestWebFilter, read Authorization: {}", authorizationToken.replace("Bearer ", ""));
//        log.info("Converter result is {}", jwtDecoder.decode(authorizationToken.replace("Bearer ", "")));
        return chain.filter(exchange);
    }
}
