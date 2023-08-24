package com.user.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entities.User;

@Service
public class UserServicesImpl implements UserService {

	List<User> usersList = List.of(
				new User(1, "Kaustubh", "9926535458"),
				new User(2, "Abhishek", "9988776655"),
				new User(3, "Ashutosh", "5566778899")
			);
	
	
	@Override
	public User getUser(int userId) {
		return usersList.stream()
				.filter(user->user.getId()==userId).findAny().orElse(null);
	}

}
