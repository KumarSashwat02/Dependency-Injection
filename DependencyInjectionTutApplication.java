package com.example.dependencyInjectionTut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionTutApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionTutApplication.class, args);

		User a = context.getBean(User.class);
		a.show();
	}

}
