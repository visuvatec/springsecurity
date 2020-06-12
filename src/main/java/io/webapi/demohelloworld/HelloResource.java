package io.webapi.demohelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	@GetMapping("/")
	public String hello() {
		return "<h3>Hello World!</h3>";
	}

}
