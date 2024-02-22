package com.example.client.web;

import com.example.client.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/chat")
    public String greetingForm(Model model) {
        System.out.println(context.getClass());
        model.addAttribute("greetingModel", new Greeting());
        return "chat";
    }

//    @PostMapping("/greeting")
//    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
//        model.addAttribute("resultModel", greeting);
//        return "result";
//    }
}
