package com.praveen.test.springtest;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/hello")
@RestController
public class HelloController {

  @GetMapping
  public String hello() { return "hi Hello";}

}
