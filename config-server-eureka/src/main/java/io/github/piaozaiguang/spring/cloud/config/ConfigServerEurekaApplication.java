package io.github.piaozaiguang.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by piaozaiguang on 2017/5/10.
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEurekaApplication.class, args);
    }
}
