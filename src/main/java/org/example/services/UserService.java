package org.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	private MessageService messageService;
	
    public void processUser(String name) {
        String message = messageService.greetUser(name);
        System.out.println(message);
    }
	
}
