package com.nt.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
@RequestMapping("/custapi")
public class CustomerOperationRestController {
    @GetMapping("/all")
	public String getAll(@RequestBody Customer cust) {
    	return cust.toString();
    }
}
