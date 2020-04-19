package com.wdh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderDemoApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(OrderDemoApplication8001.class, args);
    }
}
