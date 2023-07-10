package com.nt.rest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nt.entity.Tourist;
import com.nt.service.ITouristService;




@WebMvcTest(value=TouristOperationRestController.class)
public class RestControllerTest {
 
	@Autowired
	TouristOperationRestController ser;
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private ITouristService service;

	@Test
 public void validateTest() throws Exception {
	 System.out.println("RestControllerTest.validateTest()");
	 when(service.fethAllTourist()).thenReturn(null);
 MockHttpServletRequestBuilder req=	 MockMvcRequestBuilders.get("/Tourist-api/all");
    MvcResult result=  mockMvc.perform(req).andReturn();
     MockHttpServletResponse resp=result.getResponse();
    String str=resp.getContentAsString();
    System.out.println("88888888888888888   "+str);
    assertNotEquals(str, "sandeep");
 }
  /*
	@Test
	 public void validateTest() throws Exception {
		 System.out.println("RestControllerTest.validateTest()");
		// when(ser.getOne()).thenReturn("sandeep");
	 MockHttpServletRequestBuilder req=	 MockMvcRequestBuilders.get("/one");
	    MvcResult result=  mockMvc.perform(req).andReturn();
	     MockHttpServletResponse resp=result.getResponse();
	    int str=resp.getStatus();
	    System.out.println("88888888888888888   "+str);
	    assertNotEquals(str, "sandeep");
	 }
	 */
}
