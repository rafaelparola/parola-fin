package org.parolafin.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")
class HelloWorld {
    @GetMapping(path = "/sayHello")
    public String sayHello() {
        return "Hello World";
    }
}
