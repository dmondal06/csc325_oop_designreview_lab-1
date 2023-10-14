/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
  * The `Human` class represents a basic human being with a name, address, and age.
  * @author Deepa Mondal
  */
public abstract class Human {
    private String name;
	private String address;
	private short age;

	/**
	 * Constructs a `Human` object with a given name and age.
	 * @param name The name of the human.
	 * @param age The age of the human.
	 */
	public Human(String name, short age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Retrieves the name of the human.
	 * @return The name of the human.
	 */
	public String getName() {

		return name;
	}

	/**
	 * Sets the name of the human.
	 * @param name The new name to set for the human.
	 */
	public void setName(String name) {

		this.name = name;
	}

	/**
	 * Retrieves the address of the human.
	 *
	 * @return The address of the human.
	 */
	public abstract String getAddress() ;

	/**
	 * Sets the address of the human.
	 * @param address The new address to set for the human.
	 */
	public abstract void setAddress(String address);

	/**
	 * Retrieves the age of the human.
	 * @return The age of the human.
	 */
	public short getAge() {
		return age;
	}

	/**
	 * Sets the age of the human.
	 * @param age The new age to set for the human.
	 */
	public void setAge(short age) {
		this.age = age;
	}
}