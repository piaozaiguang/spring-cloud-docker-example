package io.github.piaozaiguang.spring.cloud.client.controller;

import io.github.piaozaiguang.spring.cloud.client.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by piaozaiguang on 2017/5/11.
 */
@RestController
public class CloudController {

    @Autowired
    private CloudService cloudService;

    @GetMapping("/services")
    @ResponseBody
    public List<String> getServices() {
        List<String> result = cloudService.getRegisteredServices();
        return result;
    }
}
