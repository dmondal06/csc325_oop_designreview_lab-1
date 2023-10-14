/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {

    private double GPA;

    /**
     * Parameterized constructor for student class containing name
     * age and gpa as parameter
     *
     * @param name the name of the student
     * @param age  the age of the student
     */
    public Student(String name, short age, double GPA){
        super(name,age);
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;

    }

    /**
     * This method overrides the abstract method getAddress from the human class
     */
    @Override
    public String getAddress(){
        return "Student's Address";
    }

    /**
     * This method overrides the abstract method setAddress from the human class
     */
    @Override
    public void setAddress(String address){

    }
    // ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code
}
