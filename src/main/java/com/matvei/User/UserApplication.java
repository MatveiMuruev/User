package com.matvei.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {

		Person person = new Person();


		SpringApplication.run(UserApplication.class, args);
	}


}
