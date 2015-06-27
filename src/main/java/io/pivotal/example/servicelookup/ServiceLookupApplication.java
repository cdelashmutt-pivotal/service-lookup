package io.pivotal.example.servicelookup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientConfiguration;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceLookupApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLookupApplication.class, args);
    }
}