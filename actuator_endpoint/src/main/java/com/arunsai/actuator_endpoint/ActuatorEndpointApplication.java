package com.arunsai.actuator_endpoint;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication
public class ActuatorEndpointApplication {

	public static void main(String[] args) {

		// SpringApplication.run(ActuatorEndpointApplication.class, args);

		SpringApplication app = new SpringApplication(ActuatorEndpointApplication.class);
		app.setApplicationStartup(new BufferingApplicationStartup(2048));
		app.run(args);

	}

}
