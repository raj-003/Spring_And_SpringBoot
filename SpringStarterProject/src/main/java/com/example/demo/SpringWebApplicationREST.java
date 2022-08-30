package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringWebApplicationREST {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context = SpringApplication.run(SpringWebApplicationREST.class, args);
	//	Employee e= context.getBean(Employee.class);
		//e.print();
	 HelloController h= context.getBean(HelloController.class);
	 System.out.println(h.display());
	}

}
