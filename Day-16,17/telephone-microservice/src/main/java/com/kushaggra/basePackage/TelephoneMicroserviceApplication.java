package com.kushaggra.basePackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TelephoneMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelephoneMicroserviceApplication.class, args);
	}

}
