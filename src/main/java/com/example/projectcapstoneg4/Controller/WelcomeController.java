package com.example.projectcapstoneg4.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller

public class WelcomeController {

    public static void main(String[] args) {
        SpringApplication.run(WelcomeController.class, args);
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        String message = "Hello, Đại Nguyễn!";
        model.addAttribute("message", message);
        return "welcome";
    }


}
