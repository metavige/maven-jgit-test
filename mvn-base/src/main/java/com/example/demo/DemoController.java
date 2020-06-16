package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
  // region Fields

  // endregion

  // region Methods
  @GetMapping("/")
  public String hello() {
    return "Hello";
  }
  // endregion
}
