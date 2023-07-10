package com.nt;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RestControllerTest {
	@GetMapping("/one/{name}")
   public ResponseEntity<String> getMsg(@PathVariable String name){
		System.out.println("RestControllerTest.getMsg()");
	    return new ResponseEntity<String>("Hellow !"+name,HttpStatus.OK);
   }
}
