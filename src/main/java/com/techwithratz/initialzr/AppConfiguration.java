package com.techwithratz.initialzr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfiguration {

//	@Bean
//	BabyHealthProvider getBabyHealthProvider() {
//		return new BabyHealthProvider();
//	}
	
	@Bean
	@Qualifier("babyHealthProvider")
	public BabyDayCare getBabyHealth() {
		return new BabyHealthProvider();
	}
	
//	@Bean
//	@Qualifier("babySitter")
//	public BabyDayCare getBabySitter() {
//		return new BabySitterProvider();
//	}
	
}
