package com.bearingpoint.todo;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {

		SpringApplication.run(TodoApplication.class, args);

	}

}
