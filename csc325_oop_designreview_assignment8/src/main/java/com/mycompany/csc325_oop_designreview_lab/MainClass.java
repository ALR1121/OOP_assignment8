/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Creating a Student object
		Student std1 = new Student("James", (short) 20);
		std1.setGpa(3.5f); // Setting GPA manually

		// Creating a Freshman object
		Freshman std2 = new Freshman("John", (short) 30, 12); // name, age, credits
		std2.setGpa(3.0f); // Setting GPA manually

		// Creating a Senior object
		Senior std3 = new Senior("Jane", (short) 25, 90); // name, age, credits
		std3.setGpa(3.8f); // Setting GPA manually

		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);

		// ToDo 12: Set the GPA of the student using the scanner and user input and then print the output.
		System.out.print("Enter GPA for student 1: ");
		float gpa1 = scanner.nextFloat();
		std1.setGpa(gpa1);
		System.out.println(std1);

		// ToDo 13: add comments and explain your code
		// The code creates instances of Student, Freshman, and Senior classes, sets their attributes, and prints their details.
	}
}

