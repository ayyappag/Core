package com.array;

import java.util.InputMismatchException;
import java.util.Scanner;



public class UserChoiceManager {

	private final static int SUBJECT_COUNT = 10;

	private Subject[] subjects = new Subject[SUBJECT_COUNT];

	private Scanner scan = new Scanner(System.in);

	public UserChoiceManager() {
	}

	public UserChoice manage() {
		System.out.println(printHelp());

		UserChoice choice = getUserChoiceById(scan);

		if (choice == UserChoice.ENTER_SUBJECT) {
			choice = enterSubjects(choice);
		}

		if (choice == UserChoice.DISPLAY_DATA) {
			printSubjectsAndGrades();
		}

		if (choice == UserChoice.CALCULATE_AVERAGE_GRADE) {
			printAverageGrade();
		}

		return choice;
	}

	private static String printHelp() {
		StringBuilder usage = new StringBuilder("\nUsage:\n");
		usage.append(UserChoice.ENTER_SUBJECT.getId()).append(
				". Enter a course name and a grade").append("\n");
		usage.append(UserChoice.DISPLAY_DATA.getId()).append(
				". Display all grades").append("\n");
		usage.append(UserChoice.CALCULATE_AVERAGE_GRADE.getId()).append(
				". Calculate the average grade").append("\n");
		usage.append(UserChoice.EXIT.getId()).append(". Exit program");

		return usage.toString();

	}

	private UserChoice getUserChoiceById(Scanner scan) {
		return UserChoice.getById(scan.nextInt());
	}

	private UserChoice enterSubjects(UserChoice choice) {
		System.out.println("Enter " + subjects.length
				+ " subjects and their corresponding grades:");
		System.out.println();

		for (int i = 0; i < subjects.length; i++) {
			String subjectName = scanSubjectName();
			int grade = scanGrade();
			subjects[i] = new Subject(subjectName.toLowerCase(), grade);
		}

		System.out.println("Thank you!");
		System.out.println();

		return choice;
	}

	private String scanSubjectName() {
		Scanner temp = new Scanner(System.in);
		String subjectName = "";
		do {
			System.out.println("Subject:");
			subjectName = temp.nextLine();
			if (subjectName.equals("")) {
				System.out.println("Empty subject name! Try again.");
			}
		} while (subjectName.equals(""));

		return subjectName;
	}

	private int scanGrade() {
		int grade = 0;
		do {
			Scanner temp = new Scanner(System.in);
			System.out.println("Grade:");
			try {
				grade = temp.nextInt();
			} catch (InputMismatchException e) {
				System.out
						.println("Invalid grade. Enter numeric value! Try again.");
			}
		} while (grade == 0);

		return grade;
	}

	private void printAverageGrade() {
		System.out.println("Total of grades: " + getSum(subjects));
		System.out.println("Count of grades: " + subjects.length);
		System.out.println("Average of grades: " + getAverage(subjects));
		System.out.println();
	}

	private void printSubjectsAndGrades() {
		System.out.println("Subjects" + "\tGrades");
		System.out.println("---------------------");

		for (int p = 0; p < subjects.length; p++) {
			System.out.println(subjects[p].getName() + "\t" + "\t"
					+ subjects[p].getGrade());
		}
	}

	public static double getAverage(Subject[] subjects) {
		int sum = 0;
		for (Subject s : subjects)
			sum += s.getGrade();
		return ((double) sum) / subjects.length;
	}

	public static double getSum(Subject[] subjects) {
		int sum = 0;
		for (Subject s : subjects) {
			sum += s.getGrade();
		}
		return sum;

	}

}
