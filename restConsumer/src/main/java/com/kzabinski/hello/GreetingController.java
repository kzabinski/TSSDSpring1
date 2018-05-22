package com.kzabinski.hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        for(int i = 0; i < 5; i++) {
        	if(true)
        		for(int j = 0; j < 10; j++) {
        			if(false);
        		}
        }
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
