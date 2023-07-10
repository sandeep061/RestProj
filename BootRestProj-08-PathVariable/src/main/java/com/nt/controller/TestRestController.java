package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRestController {
  /*
	@GetMapping("/data/{sno}/{sname}")
	public ResponseEntity<String> getData(@PathVariable String sname,@PathVariable Integer sno){
		return new ResponseEntity<>(sno+"....... "+sname,HttpStatus.OK);
	}
   */
   @GetMapping("/data/sno/{sname}")
	public String getData1(@PathVariable String sname,@PathVariable Integer sno){
		return sno+"....... "+sname+" from data 1";
	}
   @GetMapping("/data/{sno}/{sname}")
	public String getData2(@PathVariable String sname,@PathVariable Integer sno){
		return sno+"....... "+sname+" from data 2";
	}
   
   @GetMapping("/data/{sno}/sname")
	public String getData3(@PathVariable String sname,@PathVariable Integer sno){
		return sno+"....... "+sname+" from data 3";
	}
   
}
