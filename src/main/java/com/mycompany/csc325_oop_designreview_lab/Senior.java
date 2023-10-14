package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{

    private int credits;
    private final int minCredits = 85;

    /**
     * Parameterized constructor for Senior class
     * @param name the name of the student
     * @param age the age of the student
     * @param credits the credits of the student
     */
    public Senior(String name, int age, double GPA,  int credits){
        super(name, (short)age,GPA);

        //warning message if the credit for senior is below the min of 85
        if (credits < minCredits) {
            throw new IllegalArgumentException("The student's credit is below the minimum of 85");
        }
        this.credits = credits;
    }

    /**
     * This method retrieves the credits for the senior class
     * @return the credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * This method sets the credits for the seniors
     * @param credits of the seniors
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * Returns a string representation of the Senior student, including name, age, credits, and GPA.
     * @return a string with student information
     */
    @Override
    public String toString() {
        return "Senior: " + getName() + ", age: " + getAge() +
                 ", " + getCredits() + " credits, "
                + getGPA() + " GPA ";
    }

}
