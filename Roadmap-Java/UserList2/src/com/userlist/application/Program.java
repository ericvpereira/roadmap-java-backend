package com.userlist.application;

import com.userlist.controllers.UserController;

public class Program {

	public static void main(String[] args) {

		UserController controller = new UserController();

		controller.createUser("Eric", 27);
		controller.createUser("Ana", 15);

		controller.listUsers();

		controller.getUser("Eric");

		controller.updateUser("Eric", 30);
		controller.getUser("Eric");

		controller.deleteUser("Eric");
		controller.listUsers();
	}

}
