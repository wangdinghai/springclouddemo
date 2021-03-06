package com.wdh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderDemoApplication8000 {

    public static void main(String[] args) {
        SpringApplication.run(OrderDemoApplication8000.class, args);
    }

}
