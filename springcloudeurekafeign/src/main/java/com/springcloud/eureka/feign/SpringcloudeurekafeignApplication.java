package com.springcloud.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication		// This annotation boostraps and auto-configure the application.
@EnableDiscoveryClient		// This annotation lists the application on the eureka server.
@EnableFeignClients 		// This annotation enables feign client.
@EnableCircuitBreaker		// This annotation enables the circuit breaker for the microservice.
public class SpringcloudeurekafeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekafeignApplication.class, args);
	}

}
