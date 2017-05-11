package io.github.piaozaiguang.spring.cloud.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by piaozaiguang on 2017/5/10.
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${profile}")
    private String profile;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/services")
    @ResponseBody
    public List<String> services() {
        return discoveryClient.getServices();
    }

    @GetMapping("/profile")
    @ResponseBody
    public String profile() {
        return this.profile;
    }

}
