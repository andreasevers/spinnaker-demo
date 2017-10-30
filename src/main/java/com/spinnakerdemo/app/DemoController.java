package com.spinnakerdemo.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String getView() throws InterruptedException {
//        Thread.sleep(1000);
        return "demo";
    }
}
