package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PayDemoApplication9002 {
    public static void main(String[] args) {
        SpringApplication.run(PayDemoApplication9002.class, args);
    }
}
