package guru.springframework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @GetMapping(value = "/hello-world")
    public String helloWorld(){
        return "Hello World...!";
    }
}