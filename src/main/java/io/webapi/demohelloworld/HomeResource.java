package io.webapi.demohelloworld;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeResource {
	

	@GetMapping({"/home", "/"})
	public String home(Model model) {
		
		model.addAttribute("name", SecurityContextHolder.getContext().getAuthentication().getName());
		// model.addAttribute("", SecurityContextHolder.getContext().getAuthentication().getPrincipal())
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
		
		return "home";
	}
	
	@GetMapping({"/home", "/"})
	public String admin(Model model) {
		
		model.addAttribute("name", SecurityContextHolder.getContext().getAuthentication().getName());
		// model.addAttribute("", SecurityContextHolder.getContext().getAuthentication().getPrincipal())
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
		
		return "admin";
	}

}
