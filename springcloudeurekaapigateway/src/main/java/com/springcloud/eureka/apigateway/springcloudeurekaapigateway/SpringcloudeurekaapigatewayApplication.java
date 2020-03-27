package com.springcloud.eureka.apigateway.springcloudeurekaapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication	// This annotation boostraps and auto-configure the application.
@EnableDiscoveryClient	// This annotation lists the application on the eureka server.
@EnableZuulProxy		// This annotation enables the zuul gateway.
public class SpringcloudeurekaapigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekaapigatewayApplication.class, args);
	}

}
