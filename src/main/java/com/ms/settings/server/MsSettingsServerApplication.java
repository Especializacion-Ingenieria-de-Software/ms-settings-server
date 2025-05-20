package com.ms.settings.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsSettingsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSettingsServerApplication.class, args);
	}

}
