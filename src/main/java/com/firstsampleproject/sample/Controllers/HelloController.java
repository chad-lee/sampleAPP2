package com.firstsampleproject.sample.Controllers;


import com.firstsampleproject.sample.Models.Hello;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@CrossOrigin( origins = "http://localhost:4200")
public class HelloController {

    private static final String template = "HELLO!!!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public Hello helloFunction(String name){
        return new Hello(counter.incrementAndGet(), template);
    }



}
