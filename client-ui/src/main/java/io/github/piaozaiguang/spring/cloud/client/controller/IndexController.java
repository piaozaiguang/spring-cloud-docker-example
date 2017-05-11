package io.github.piaozaiguang.spring.cloud.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by piaozaiguang on 2017/5/11.
 */
@Controller
public class IndexController {

    @GetMapping("")
    public RedirectView index() {
        return new RedirectView("/index.html");
    }
}
