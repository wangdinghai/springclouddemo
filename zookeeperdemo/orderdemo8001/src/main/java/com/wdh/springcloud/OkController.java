package com.wdh.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OkController {

    @Value("${spring.application.name}")
    private String host;

    @Value("${server.port}")
    private String port;

    @GetMapping("ok")
    public String ok() {
        return "order ok. " + host + ":" + port + " " + System.currentTimeMillis();
    }
}
