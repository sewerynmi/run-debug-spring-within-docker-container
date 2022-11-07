package com.severinu.dockerbasedapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerBasedAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerBasedAppApplication.class, args);
        System.out.println("Cool, the app is running ...");
    }

}
