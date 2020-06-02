package com.techwithratz.initialzr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

	@Bean
	BabyHealthProvider getBabyHealthProvider() {
		return new BabyHealthProvider();
	}
}
