package com.praveen.test.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
  @RequestMapping("/home")
  public String hello() {
    return "hi praveen welcome - app is running ";
  }
}
