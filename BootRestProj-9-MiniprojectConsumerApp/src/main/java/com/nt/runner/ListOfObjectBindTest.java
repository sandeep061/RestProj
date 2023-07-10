package com.nt.runner;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.entity.Tourist;

@Component
public class ListOfObjectBindTest implements CommandLineRunner {

	@Autowired
	private RestTemplate templete;
	@Override
	public void run(String... args) throws Exception {
		String url="http://localhost:9999/Tourist-api/all";
		ResponseEntity<String>res=templete.exchange(url, HttpMethod.GET, null, String.class);
		System.out.println("All Object Data:"+res.getBody());
     System.out.println("=====================================");
	  String json_result=res.getBody();
   ObjectMapper om=new ObjectMapper();
   List<Tourist>list=  om.readValue(json_result, new TypeReference<List<Tourist>>() {
	});
      list.forEach(System.out::println);
	}

}
