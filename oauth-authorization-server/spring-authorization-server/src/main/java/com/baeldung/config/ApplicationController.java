package com.baeldung.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class ApplicationController {
 
    @GetMapping("/custom-login")
    public String viewLoginPage() {
        return "custom-login";
    }
 
}