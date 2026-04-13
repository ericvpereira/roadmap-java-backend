package com.userlist.controllers;

import java.util.List;

import com.userlist.entities.User;
import com.userlist.services.UserService;

public class UserController {

	UserService service = new UserService();

	public void createUser(String name, int age) {
		service.addUser(new User(name, age));
		System.out.println("200 OK - User created");
	}

	public void listUsers() {
		List<User> users = service.getAllUsers();
		System.out.println(users);
	}

	public void getUser(String name) {
		try {
			System.out.println(service.findByName(name));
		} catch (IllegalArgumentException e) {
			System.out.println("404 NOT FOUND - " + e.getMessage());
		}
		
		System.out.println(service.findByName(name));
	}

	public void updateUser(String name, int newAge) {
		service.updateUser(name, newAge);
		System.out.println("User update");
	}

	public void deleteUser(String name) {
		service.deleteUser(name);
		System.out.println("User deleted");
	}

}
