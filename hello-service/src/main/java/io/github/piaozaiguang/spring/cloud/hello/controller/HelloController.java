package io.github.piaozaiguang.spring.cloud.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by piaozaiguang on 2017/5/10.
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("")
    public List<String> showServices() {
        return discoveryClient.getServices();
    }

}
