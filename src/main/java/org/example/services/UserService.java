package org.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// Default scope is Singleton, which means only 1 instance is created
//@Scope("prototype")
public class UserService {

	@Autowired
	private MessageService messageService;
	
    public void processUser(String name) {
        String message = messageService.greetUser(name);
        System.out.println(message);
    }
	
}
