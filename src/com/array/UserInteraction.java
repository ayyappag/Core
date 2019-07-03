package com.array;

public class UserInteraction {

	public static void main(String[] args) {
		UserChoiceManager userChoiceManager = new UserChoiceManager();
		UserChoice choice = UserChoice.UNKNOWN;

		do {
			choice = userChoiceManager.manage();
		} while (choice != UserChoice.EXIT);

		System.out.println("Bye!");
	}

}
