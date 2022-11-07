package com.severinu.dockerbasedapp.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @GetMapping
    public ResponseEntity<String> demo() {
        LOGGER.info("Accessing /api/demo GET requests");
        return new ResponseEntity<>( "Demo response", HttpStatus.OK);
    }
}
