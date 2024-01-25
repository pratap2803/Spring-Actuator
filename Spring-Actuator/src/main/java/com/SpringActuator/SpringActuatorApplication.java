package com.SpringActuator;

import com.SpringActuator.helper.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringActuatorApplication {

	@Autowired
	private Student student;
	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorApplication.class, args);
	}

}
