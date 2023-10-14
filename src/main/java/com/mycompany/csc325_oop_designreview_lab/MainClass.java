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


	 Student std1 = new Student("James", (short) 20);
	 Freshman Freshman1 = new Freshman("Sarah", (short) 18, 12);
	 Senior std2 = null;

	 //scanner object to read in the gpa and credits for student
	 Scanner scanner = new Scanner(System.in);

	 System.out.print("Enter GPA for Student James: ");
	 double jamesGPA = scanner.nextDouble();
	 std1.setGPA(jamesGPA);
	 System.out.println(std1);

	 System.out.print("Enter GPA for Freshman Sarah: ");
	 double sarahGPA = scanner.nextDouble();
	 Freshman1.setGPA(sarahGPA);
	 System.out.println(Freshman1);

	 try {
		 System.out.print("Enter GPA for Senior John: ");
		 double johnGPA = scanner.nextDouble();
		 System.out.print("Enter the number of credits for Senior John: ");
		 int johnCredits = scanner.nextInt();
		std2 = new Senior("John", (short) 22, johnCredits);
		 std2.setGPA(johnGPA);
		 //throws an exception if the credits are less than 85 for a senior
	 } catch (IllegalArgumentException e) {
		 System.out.println("Error: " + e.getMessage());
	 }

	 if (std2 != null) {
		 System.out.println(std2);
	 }
	 scanner.close();


 }

}

