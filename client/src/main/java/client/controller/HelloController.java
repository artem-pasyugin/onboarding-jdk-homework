package client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${text}")
    private String text;

    @GetMapping("/hello")
    public String getGreeting() {
        return text;
    }
}
