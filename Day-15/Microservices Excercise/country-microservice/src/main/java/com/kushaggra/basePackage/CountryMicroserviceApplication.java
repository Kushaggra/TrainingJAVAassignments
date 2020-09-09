package com.kushaggra.basePackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.kushaggra.basePackage")
public class CountryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryMicroserviceApplication.class, args);
	}

}
