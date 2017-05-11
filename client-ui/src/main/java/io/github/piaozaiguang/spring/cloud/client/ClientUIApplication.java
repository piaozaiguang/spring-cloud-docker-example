package io.github.piaozaiguang.spring.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by piaozaiguang on 2017/5/11.
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ClientUIApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientUIApplication.class, args);
    }
}
