package com.array;

public enum UserChoice {
	UNKNOWN(0), ENTER_SUBJECT(1), DISPLAY_DATA(2), CALCULATE_AVERAGE_GRADE(3), EXIT(
			4);

	private int id;

	public int getId() {
		return id;
	}

	UserChoice(int id) {
		this.id = id;
	}

	public static UserChoice getById(int input) {
		for (UserChoice value : UserChoice.values()) {
			if (value.getId() == input) {
				return value;
			}
		}
		return UserChoice.UNKNOWN;
	}

}
