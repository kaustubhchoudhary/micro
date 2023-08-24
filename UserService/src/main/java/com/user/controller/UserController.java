package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entities.User;
import com.user.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable(value="id") int id) {
		
		User user = this.userService.getUser(id); 
		
		//http://localhost:9002/contact/user/1
		
		List contacts = this.restTemplate
				.getForObject("http://contact-service/contact/user/"+id, List.class);
		
		user.setContactsList(contacts);
		return user;
	}
}
