package com.thetechbologs.unittestingspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    public @ResponseBody String greeting(){
        return "Hello World";
    }
}
