package com.example.client;

import com.example.client.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NavigationController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greetingModel", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("resultModel", greeting);
        return "result";
    }
}
