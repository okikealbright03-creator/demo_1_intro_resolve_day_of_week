package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToJetInfo() {
        // Redirect the root URL to the JSF page jetinfo.xhtml
        return "redirect:/resolve-day-of-week.xhtml";
    }
    
    
}
