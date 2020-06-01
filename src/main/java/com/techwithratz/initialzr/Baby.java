package com.techwithratz.initialzr;

import org.springframework.beans.factory.annotation.Required;

public class Baby {
	
	private String name;
	private double weight;
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
		
}
