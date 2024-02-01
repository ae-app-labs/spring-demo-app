package org.example;

import org.example.services.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml")) {

			UserService myService = context.getBean(UserService.class);
			myService.processUser("Jake");
		}
	}
}
