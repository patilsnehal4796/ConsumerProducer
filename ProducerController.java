package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Atm;

@RestController
public class ProducerController 
{
	
	@GetMapping("/see")
   public List<Atm> produceData()
   {
	List<Atm> atm=new ArrayList<Atm>();
	
	Atm a=new Atm();
	a.setAtmid(1111);
	a.setAtmname("SBI");
	a.setAtmpin(123);
	
	Atm a1=new Atm();
	a1.setAtmid(2222);
	a1.setAtmname("HDFC");
	a1.setAtmpin(456);
	
	Atm a2=new Atm();
	a2.setAtmid(3333);
	a2.setAtmname("vijaya");
	a2.setAtmpin(123);
    
	atm.add(a);
	atm.add(a1);
	atm.add(a2);
		
	return atm;
	   
	   
	   
   }
}
