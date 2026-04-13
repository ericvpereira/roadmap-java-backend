package com.userlist.entities;

public class User {

	private String name;
	private int age;

	public User() {
	}

	public User(String name, int age) {
		setName(name);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}
		this.age = age;
	}

	public boolean isAdult() {

		return age >= 18;
	}

	public String getAgeStatus() {
		String ageStatus = isAdult() ? "Adult" : "Minor";
		return name + " is " + ageStatus;
	}

	@Override
	public String toString() {
		return getAgeStatus() + " (age " + age + ")";
	}

}
