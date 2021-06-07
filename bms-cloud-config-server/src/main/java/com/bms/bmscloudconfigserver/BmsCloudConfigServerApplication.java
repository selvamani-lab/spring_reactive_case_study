package com.bms.bmscloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class BmsCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmsCloudConfigServerApplication.class, args);
	}

}
