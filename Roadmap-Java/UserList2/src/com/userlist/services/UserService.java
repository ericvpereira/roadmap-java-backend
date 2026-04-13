package com.userlist.services;

import java.util.ArrayList;
import java.util.List;

import com.userlist.entities.User;

public class UserService {

	private List<User> users = new ArrayList<>();

	public void addUser(User user) {
		for (User u : users) {
			if (u.getName().equalsIgnoreCase(user.getName())) {
				throw new IllegalArgumentException("User already exists");
			}
		}
		users.add(user);
	}

	public List<User> getAllUsers() {
		return new ArrayList<>(users);
	}

	public User findByName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}

		for (User user : users) {
			if (user.getName().trim().equalsIgnoreCase(name.trim())) {
				return user;
			}
		}
		throw new IllegalArgumentException("User not found: " + name);
	}

	public void updateUser(String name, int newAge) {
		User user = findByName(name);
		user.setAge(newAge);
	}

	public void deleteUser(String name) {
		User user = findByName(name);
		users.remove(user);
	}

}
