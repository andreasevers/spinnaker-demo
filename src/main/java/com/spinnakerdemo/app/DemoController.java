package com.spinnakerdemo.app;

import io.micrometer.core.annotation.Timed;
import org.springframework.http.CacheControl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

import java.util.Random;

import static java.util.concurrent.TimeUnit.SECONDS;

@Timed
@Controller
public class DemoController {

    private Random randomGen = new Random();

    private int CHAOS = 0;

    @RequestMapping("/")
    @Timed("rickandmorty.rendering.time")
    public String getView(HttpServletResponse response) {
        response.addHeader("Cache-Control", CacheControl.maxAge(0, SECONDS).getHeaderValue());
        response.addHeader("Connection", "close");

        try {
            Thread.sleep(CHAOS + randomGen.nextInt(100));
        } catch (InterruptedException e) {
        }

        return "picklerick";
    }
}