package com.walterbernal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  
  // GET HTTP Method
  // http://localhost:8080/
  @GetMapping("/")
  public String message() {
    return "<h1>Welcome to Spring Boot Applicaton</h1>";
  }

  // GET HTTP Method
  // http://localhost:8080/hello-world
  @GetMapping("/hello-world")
  public String helloWorld() {
    return "<h1>Hello World</h1>";
  }
}
