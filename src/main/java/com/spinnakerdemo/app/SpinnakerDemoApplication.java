package com.spinnakerdemo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpinnakerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpinnakerDemoApplication.class, args);
	}
}
