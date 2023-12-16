package com.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.lti.rest.EmployeeController;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = "com.lti")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
