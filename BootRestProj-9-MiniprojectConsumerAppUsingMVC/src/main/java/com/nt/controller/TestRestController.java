package com.nt.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.entity.Tourist;

@Controller
public class TestRestController {

	 
//	@GetMapping("/")
	  public String registerPage() {
		  return "index";
	  }
	 @PostMapping("/register")
	 public void saveData(@ModelAttribute Tourist tour) {
		 RestTemplate rt=new RestTemplate();
		 String url="http://localhost:9999/Tourist-api/save";
		 
	//	String json_Body="{\"name\":\""+tour.getName()+""+,\"city\":\"bbsr\",\"packageType\":\"l3\",\"budget\":3400.0}";
		 HttpHeaders headers=new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			//prepare Http Headers and Body
		//	HttpEntity<String>request=new HttpEntity<String>(json_Body,headers);
         
	 }
	 @GetMapping("/")
	 public String sendData(@ModelAttribute("to") Tourist tos) {
		 Tourist tor=null;
		 RestTemplate templete=new RestTemplate();
		 String url="http://localhost:9999/Tourist-api/one/50";
	      ResponseEntity<String> response=templete.getForEntity(url, String.class);
	      String json_Data=response.getBody();
	      ObjectMapper om=new ObjectMapper();
	     try {
			 tor= om.readValue(json_Data, Tourist.class);
			 BeanUtils.copyProperties(tor, tos);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      System.out.println("Object Data ::"+response.getBody());
	     // System.out.println(tor);
	      System.out.println(tos);
	      return"index";
	 }
}
