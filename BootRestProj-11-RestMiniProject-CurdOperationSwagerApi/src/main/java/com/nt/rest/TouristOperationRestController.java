package com.nt.rest;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Tourist;
import com.nt.service.ITouristService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("Tourist-api")
public class TouristOperationRestController {
  @Autowired
	private ITouristService service;
   
 
  @PostMapping("/save")
  
  public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist){
	  String res=service.registerTourist(tourist);
	  return new ResponseEntity<String>(res,HttpStatus.CREATED);
  }
  
  //fetch all Tourist
  @GetMapping("/all")
  public ResponseEntity<List<Tourist>> getallTourest(){
	  List<Tourist>list=service.fethAllTourist();
	  return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
  }
  //fetch tourest By id
  @GetMapping("/one/{id}")
    public ResponseEntity<?> getTourestById(@PathVariable Integer id){
    	try {
    		Tourist tst=service.fetchTouristById(id);
    		return new ResponseEntity<Tourist>(tst,HttpStatus.OK); 
    	}
    	catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
  }
    	
    	 @GetMapping("/name/{name}")
    	    public ResponseEntity<?> getTourestByName(@PathVariable String name){
    	    	try {
    	    		List<Tourist> tst=service.fetchTouristByName(name);
    	    		return new ResponseEntity<List<Tourist>>(tst,HttpStatus.OK); 
    	    	}
    	    	catch (Exception e) {
    				return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    			}
    	    	
    	 }
    	    	//update operation
    	    	@PutMapping("/update")
    	    	public ResponseEntity<?> modifyTourist(@RequestBody Tourist tour){
    	    		try {
    	    			String res=service.updateTouristDetails(tour);
    	    		return new ResponseEntity<String>(res,HttpStatus.OK);
    	    	}catch (Exception e) {
    	    		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				}
    	    	}
    	  @PatchMapping("/p/{id}/{name}")
    	    		public ResponseEntity<?> pModify(@PathVariable Integer id,@PathVariable String name){
    	    		    try {
    	    		    	String res=service.updateTourist(id, name);
    	    		    	return new ResponseEntity<String>(res,HttpStatus.OK);
    	    		    }catch (Exception e) {
    	    	    		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    					}
    	    		}
    }

