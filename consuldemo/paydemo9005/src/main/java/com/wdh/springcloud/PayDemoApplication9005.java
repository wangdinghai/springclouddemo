package com.wdh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PayDemoApplication9005 {

    public static void main(String[] args) {
        SpringApplication.run(PayDemoApplication9005.class, args);
    }

}
