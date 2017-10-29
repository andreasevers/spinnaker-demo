package com.spinnakerdemo.spinnakerdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Andreas Evers
 */
@Controller
public class DemoController {

    @RequestMapping("/demo")
    public String getView() throws InterruptedException {
        System.out.println("Request started");
        Thread.sleep(1000);
        System.out.println("Request returned");
        return "demo";
    }
}
