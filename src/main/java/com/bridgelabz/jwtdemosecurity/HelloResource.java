package com.bridgelabz.jwtdemosecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloResource {

    @RequestMapping({"/hello"})
    public String firstPage() {
        return "HELLO WORLD!!";
    }

}
