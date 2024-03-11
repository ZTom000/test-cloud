package org.ztom.cloud.seata.clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description TODO
 * @Author 翟涛
 * @Version 1.0
 * @Date 2024/3/7 10:28
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SeataClientaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataClientaApplication.class, args);
    }
}
