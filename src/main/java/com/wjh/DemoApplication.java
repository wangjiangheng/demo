package com.wjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        int i=2;
        System.out.println(i);
        SpringApplication.run(DemoApplication.class, args);
    }

}
