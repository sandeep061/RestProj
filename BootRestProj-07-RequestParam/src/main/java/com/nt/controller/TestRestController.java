package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRestController {
    @GetMapping("/data")
	public String getData(@RequestParam Integer sno,@RequestParam (required = false,defaultValue = "rajesh") String sname) {
		return sno+"  .................. "+sname;
	}
}
