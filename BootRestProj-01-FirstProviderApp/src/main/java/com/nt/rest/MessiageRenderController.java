package com.nt.rest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/smsapi")
public class MessiageRenderController {
  
	@GetMapping("/wish")
	public ResponseEntity<String> getWishMes(){
		//get system date 
		LocalDateTime ldt=LocalDateTime.now();
	  String sms=null;
		int hour=ldt.getHour();
		if(hour<12) {
			sms="GOOD MORNING";
		}
		else if(hour<16) {
				sms="GOOD Afternoon";
		 }
		else if(hour<20) {
			sms="GOOD Evening";
		}
		else {
			sms="GOOD Night";
		}
		return new ResponseEntity<String>(sms,HttpStatus.OK);
	}
	@GetMapping("/age")
	public ResponseEntity<Map<String, Integer>> getEmpAge(){
		Map<String, Integer>map=new HashMap<>();
		map.put("Babu", 4);
		map.put("Babul", 24);
		map.put("Bijay", 40);
		map.put("Saba", 35);
		return new ResponseEntity<Map<String,Integer>>(map,HttpStatus.OK);
	}
}
