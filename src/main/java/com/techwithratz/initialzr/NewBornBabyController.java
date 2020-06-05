package com.techwithratz.initialzr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.temporary.ComponentScanTest;

@RestController
public class NewBornBabyController {

	@Value("${baby.weight:No baby weight property found}")
	String babyWeight;
	
	@Autowired
	NewBornBabyService newBornBabyService;
	
	@Autowired
	ComponentScanTest componentScanTest;
		
	@GetMapping("baby/name")
    public String getBabyName() {
    	return "The baby name is " + newBornBabyService.getBabyName() +
    		". The baby weight is "+babyWeight;
    }
	
	@GetMapping("baby")
    public Baby getBaby() {
		componentScanTest.hello();
    	return newBornBabyService.getBaby();
    }
}
