package com.nt.config;

import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwagerConfiguration {

	@Bean
    public Docket createDocket() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.nt.rest"))              
          .paths(PathSelectors.regex("/Tourist-api.*"))         
          .build()
          .useDefaultResponseMessages(true)
          .apiInfo(apiInfo()) ;                                           
    }
	//This is optional
	@Bean
	public ApiInfo apiInfo() {
		Contact con=new Contact("Sandeep", "http://www.HCL.com/tourist", "Sandeep.13sahoo@gmail.com");
		return new ApiInfo("Tourist-Api",
				                          "Api for Tourist operation",
				                          "1.0", 
				                          "http://www.terms.com",
				                          con,
				                          "GNUSAndeep","babul",
				                          Collections.emptyList()
				                          );
	}
	
}
