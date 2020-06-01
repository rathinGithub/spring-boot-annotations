package com.techwithratz.initialzr;

import org.springframework.stereotype.Component;

@Component
public class NewBornBabyService {

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
