package com.spinnakerdemo.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.CacheControl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

@Controller
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/")
    public String getView(HttpServletResponse response) {
        String headerValue = CacheControl.maxAge(0, TimeUnit.SECONDS)
                .getHeaderValue();

        response.addHeader("Cache-Control", headerValue);
        response.addHeader("Connection", "close");
        // logger.info("Meeseeks");
        return "demo";
    }
}
