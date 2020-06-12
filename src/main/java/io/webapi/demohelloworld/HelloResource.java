package io.webapi.demohelloworld;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	private String currentUser;
	
	@GetMapping("/")
	public String hello() {
		
		setCurrentUser(SecurityContextHolder.getContext().getAuthentication().getName());
		return "<h3>Hello World! Welcome " +  this.currentUser + "</h3>";
	}
	
	public String getCurrentUser() {
		return this.currentUser;
	}
	
	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}

}
