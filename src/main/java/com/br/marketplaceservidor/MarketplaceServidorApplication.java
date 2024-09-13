package com.br.marketplaceservidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MarketplaceServidorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketplaceServidorApplication.class, args);
    }

}
