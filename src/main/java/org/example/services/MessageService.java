package org.example.services;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
    public void doSomething() {
        System.out.println("Hello Universe...");
    }
    
    public String greetUser(String name) {
    	return "Hello " + name;
    }
}
