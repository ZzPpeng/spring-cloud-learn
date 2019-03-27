package com.zp.eurakaprovid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurakaProvidApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(EurakaProvidApplication2.class, args);
    }

}
