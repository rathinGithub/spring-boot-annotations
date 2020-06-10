package com.techwithratz.initialzr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewBornBabyService {
	
	//@Autowired
	//BabyHealthProvider babyHealthProvider;
	
	@Autowired
	@Qualifier("babyHealthProvider")
	BabyDayCare babyDayCare;

	public String getBabyName() {
		return "Vihaan";
	}

	public Baby getBaby() {
		Baby baby = new Baby();
		baby.setName("Biju");
		baby.setWeight(2.5);
		return baby;
	}
}
