package com.mosoftvn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DemoController {
    @GetMapping("/403")
    public String demo(){
        return "403";
    }
}
