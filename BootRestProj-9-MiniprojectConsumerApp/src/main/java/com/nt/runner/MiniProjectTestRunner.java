package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

  //@Component
public class MiniProjectTestRunner implements CommandLineRunner {
 
	@Autowired
	private RestTemplate template;
	@Override
	public void run(String... args) throws Exception {
		/*
		//Get Single record from db
		String url="http://localhost:9999/Tourist-api/one/50";
      ResponseEntity<String> response=template.getForEntity(url, String.class);
      System.out.println("Object Data ::"+response.getBody());
      */
		/*
		//gel all record
		String url="http://localhost:9999/Tourist-api/all";
		ResponseEntity<String> response=template.getForEntity(url, String.class);
	      System.out.println("Object Data ::"+response.getBody());
	      System.out.println("Object Data ::"+response.getStatusCodeValue());
	   */
		//send data using post mode
		String url="http://localhost:9999/Tourist-api/save";
		String json_Body="{\"name\":\"babull\",\"city\":\"bbsr\",\"packageType\":\"l3\",\"budget\":3400.0}";
		
		//prepare Headers
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		//prepare Http Headers and Body
		HttpEntity<String>request=new HttpEntity<String>(json_Body,headers);
		ResponseEntity<String>res=template.postForEntity(url, request, String.class);
		System.out.println("Post mode Result:"+res.getBody());
	}
        
}
