/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;
/**
 * This is the main class for the OOP Design Review Lab.
 * It demonstrates the creation of Student, Freshman, and Senior objects
 * and allows input of GPA and credits for Senior students.
 *
 * @author Deepa Mondal
 */
public class MainClass {
	/**
	 * This is the main class for the OOP Design Review Lab.
	 * It demonstrates the creation of Student, Freshman, and Senior objects
	 * and allows input of GPA and credits for Senior students.
	 *
	 * @author Deepa Mondal
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input GPA for Student James
		System.out.print("Enter GPA for Student James: ");
		double jamesGPA = scanner.nextDouble();
		Student std1 = new Student("James", (short) 20, jamesGPA);
		System.out.println(std1);

		// Input GPA for Freshman Sarah
		System.out.print("Enter GPA for Freshman Sarah: ");
		double sarahGPA = scanner.nextDouble();
		Freshman Freshman1 = new Freshman("Sarah", (short) 18, sarahGPA, 12);
		System.out.println(Freshman1);

		// Input GPA and credits for Senior John
		try {
			System.out.print("Enter GPA for Senior John: ");
			double johnGPA = scanner.nextDouble();
			System.out.print("Enter the number of credits for Senior John: ");
			int johnCredits = scanner.nextInt();
			Senior std2 = new Senior("John", (short) 22, johnGPA, johnCredits);
			std2.setGPA(johnGPA);
			System.out.println(std2);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

		scanner.close();
	}

}

