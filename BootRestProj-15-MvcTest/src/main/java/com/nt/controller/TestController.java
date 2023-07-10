package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nt.model.Student;

@Controller
@RequestMapping("/test")
public class TestController {
	@GetMapping("/first")
   public @ResponseBody Student showView() {
	    return new Student(101,	 "sandeep");
   }
}
