package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BootRestProj10ConsumerAppApplication {
   @Bean(name="r")
	public RestTemplate createRt() {
		return new RestTemplate();
	}
	  
	public static void main(String[] args) {
		SpringApplication.run(BootRestProj10ConsumerAppApplication.class, args);
	}

}
