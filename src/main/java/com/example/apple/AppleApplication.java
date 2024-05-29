package com.example.apple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class AppleApplication {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "Hello World!";
  }


  @GetMapping("/path/to/content/{id}")
  public String handleLink(@PathVariable String id) {
    // Logic to handle the link, e.g., redirect to a specific page or load content
    return "redirect:/";
  }

  public static void main(String[] args) {
    SpringApplication.run(AppleApplication.class, args);
  }

}
