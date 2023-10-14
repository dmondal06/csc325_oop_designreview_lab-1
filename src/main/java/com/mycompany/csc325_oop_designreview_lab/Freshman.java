package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    private int credits;
    /**
     * Parameterized Constructor for the freshman class
     *
     * @param name    Student's name.
     * @param age     Student's age.
     * @param credits Number of credits completed.
     */
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


    /**
     * tostring override for the senior class
     * @return it returns the string representation of the student object
     */
    @Override
    public String toString() {
        return "Freshman [Name: " + getName() + ", Age: "
                + getAge() + ", Credits: " + credits + "]";
    }
}