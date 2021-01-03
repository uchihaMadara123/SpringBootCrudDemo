package com.SpringBootCrudDemo.SpringBootCrudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.SpringBootCrudDemo")
@EntityScan("com.SpringBootCrudDemo.Entity")
public class SpringBootCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudDemoApplication.class, args);
	}

}
