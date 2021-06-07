package com.bms.namingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BmsNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmsNamingServerApplication.class, args);
	}

}
