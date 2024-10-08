package org.sportify.SportifyApplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

        @GetMapping("/ping")
        public ResponseEntity ping() {
            return ResponseEntity.status(HttpStatus.OK).body("pong");
        }
}
