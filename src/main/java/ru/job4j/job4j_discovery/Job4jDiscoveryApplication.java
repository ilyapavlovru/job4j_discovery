package ru.job4j.job4j_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Job4jDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(Job4jDiscoveryApplication.class, args);
    }

}
