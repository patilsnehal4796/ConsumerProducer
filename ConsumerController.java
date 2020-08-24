package com.cjc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.model.Atm;

@RestController
public class ConsumerController 
{
	@GetMapping("/display")
    public ResponseEntity<Atm[]> consumeData()
    {
    	System.out.println("In controller");
		RestTemplate template=new RestTemplate();
		ResponseEntity<Atm[]> atm=template.getForEntity("http://localhost:7722/see",Atm[].class);
		return atm;
    	
    	
    	
    	
    }
}
