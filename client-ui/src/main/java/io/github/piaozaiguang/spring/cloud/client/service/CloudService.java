package io.github.piaozaiguang.spring.cloud.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by piaozaiguang on 2017/5/11.
 */
@FeignClient(name = "hello-service")
public interface CloudService {
    @GetMapping("/services")
    List<String> getRegisteredServices();
}
