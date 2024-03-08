package org.ztom.cloud.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
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
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        log.info("TestFilter get uri {}", request.getURI());
        return chain.filter(exchange);
    }
}
