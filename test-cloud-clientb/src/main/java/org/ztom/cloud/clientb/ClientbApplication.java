package org.ztom.cloud.clientb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description TODO
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/7 10:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientbApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientbApplication.class, args);
    }
}
