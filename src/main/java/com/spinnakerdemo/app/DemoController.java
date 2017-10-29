package com.spinnakerdemo.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Andreas Evers
 */
@Controller
public class DemoController {

    @RequestMapping("/demo")
    public String getView() throws InterruptedException {
//        Thread.sleep(1000);
        return "demo";
    }
}
