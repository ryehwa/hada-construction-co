package com.hada.hadaConstruction.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/say")
    public String test(Model model) {
        model.addAttribute("say", "Hello");
        model.addAttribute("say2", "ByeBye");
        return "test";
    }
}
