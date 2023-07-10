package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestRunner implements CommandLineRunner {
  
	@Autowired
	  private RestTemplate template;
	@Override
	public void run(String... args) throws Exception {
	 String url="http://localhost:3030/BootRestProj-10-ProviderApp/test/one/sandeep";
       ResponseEntity<String>response=template.getForEntity(url, String.class);
       System.out.println(" Get Data"+response.getBody());
	}

}
