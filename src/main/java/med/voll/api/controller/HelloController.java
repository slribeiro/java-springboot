package med.voll.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @GetMapping("1")
  public String hello1() {
    return "Hello World - Sergio";
  }

  @GetMapping("2")
  public String hello2() {
    return "Hello World - Luiz";
  }

}