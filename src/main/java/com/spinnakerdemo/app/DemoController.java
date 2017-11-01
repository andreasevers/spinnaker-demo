package com.spinnakerdemo.app;

import org.springframework.http.CacheControl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String getView(HttpServletResponse response) throws InterruptedException {
        String headerValue = CacheControl.maxAge(0, TimeUnit.SECONDS)
                .getHeaderValue();

        response.addHeader("Cache-Control", headerValue);
//        Thread.sleep(1000);
        return "demo";
    }
}
