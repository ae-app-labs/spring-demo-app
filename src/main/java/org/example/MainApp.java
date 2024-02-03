package org.example;

import org.example.services.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml")) {

			// Request the Spring Container to return an instance of UserService class type
			UserService myService = context.getBean(UserService.class);
			System.out.println("Service Object: " + myService);
			
			UserService service2 = context.getBean(UserService.class);
			System.out.println("Second Oject: " + service2);
			
			// Check if they are the same
			//System.out.println(myService == service2);
			
			// Call a method on the object maintained by spring container
			myService.processUser("Jake");
		}
	}
}
