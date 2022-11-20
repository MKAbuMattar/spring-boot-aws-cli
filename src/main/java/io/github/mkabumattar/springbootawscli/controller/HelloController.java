package io.github.mkabumattar.springbootawscli.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public ResponseEntity<Object> hello() {
        var response = new Object() {
            public final String message = "Hello World!";
        };

        return ResponseEntity.ok(response);
    }
}
