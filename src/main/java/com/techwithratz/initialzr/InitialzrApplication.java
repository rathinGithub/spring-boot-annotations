package com.techwithratz.initialzr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.techwithratz.initialzr","com.temporary"})
@SpringBootApplication
public class InitialzrApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialzrApplication.class, args);
	}

}
