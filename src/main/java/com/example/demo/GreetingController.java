package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  //returns a JSON bydefault
  @GetMapping("/greeting")
  public Greeting getMessage(@RequestParam(value = "name", defaultValue = "world") String name) {
      return new Greeting(2, name);
  }
}
