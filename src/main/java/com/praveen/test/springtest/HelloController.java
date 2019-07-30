package com.praveen.test.springtest;



@org.springframework.web.bind.annotation.RequestMapping("/hello")
@org.springframework.web.bind.annotation.RestController
public class HelloController {

  @org.springframework.web.bind.annotation.GetMapping
  public String hello() {
    return "hi praveen welcome - app is running ";
  }
}
