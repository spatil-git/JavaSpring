package com.sprintbasics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		ArrayLookup search = context.getBean(ArrayLookup.class);
		System.out.println("Output : " + search.search(new int[]{5,2,7,8,1,4}, 4));
	}

}
