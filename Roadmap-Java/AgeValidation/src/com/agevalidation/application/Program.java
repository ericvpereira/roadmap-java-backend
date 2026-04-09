package com.agevalidation.application;

import com.agevalidation.entities.User;

public class Program {

	public static void main(String[] args) {
		
		try {
			User user1 = new User("Eric", 27);
			System.out.println(user1.getAgeStatus());
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
