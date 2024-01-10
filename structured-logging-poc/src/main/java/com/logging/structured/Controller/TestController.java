package com.logging.structured.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logging")
@Slf4j
public class TestController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        log.info("Saying Hello ...");
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
