package guru.springframework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import guru.springframework.controllers.HelloWorldBean;

@RestController
public class CustomController {

    @GetMapping(value = "/hello-world")
    public String helloWorld(){
        return "Hello World...!";
    }

    @GetMapping(value = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(value = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean1(@PathVariable String name){
        System.out.println("Name : "+name);
        return new HelloWorldBean(String.format("Hello World, %s",name));
    }
}