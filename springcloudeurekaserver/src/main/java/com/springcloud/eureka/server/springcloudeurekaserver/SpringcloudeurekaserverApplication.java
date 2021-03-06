package com.springcloud.eureka.server.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekaserverApplication.class, args);
	}

}
