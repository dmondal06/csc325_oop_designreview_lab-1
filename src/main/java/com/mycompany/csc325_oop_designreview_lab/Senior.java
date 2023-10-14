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
    public Senior(String name, int age, int credits){
        super(name, (short)age);
        this.credits = credits;
        //warning message if the credit for senior is below the min of 85
        if(credits < minCredits){
            System.out.println("Warning: The student's credit is below the minimum of 85");
        }
    }
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


    @Override
    public String toString() {
        return "Senior: " + getName() + ", age: " + getAge() +
                 ", " + getCredits() + " credits, "
                + getGPA() + " GPA ";
    }

}
