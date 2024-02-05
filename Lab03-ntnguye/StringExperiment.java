/*
 * Created on: %{date}
 *
 * ULID: ntnguye
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author Nghia Nguyen
 *
 */
public class StringExperiment
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Input your First Name: ");
		String Firstname = keyboard.next();

		System.out.println("Input your Middle Name: ");
		String Middlename = keyboard.next();

		System.out.println("Input your Last Name: ");
		String Lastname = keyboard.next();

		System.out.println("Your name is: " + Firstname + ' ' + Middlename + ' ' + Lastname); // concat 3 strings
		System.out.println("Your name is: " + Firstname + ' ' + "M." + ' ' + Lastname);
		System.out.println("Your name is: " + Firstname.toUpperCase() + ' ' + Lastname.toLowerCase());
		System.out.println("Lenght of the Last name:" + Lastname.length()); // Use Length method

		int middle_position = (Lastname.length()) / 2; // Calculate the index of middle for Last name

		System.out.println("The middle position of your Last name: " + middle_position);

		System.out.println("The last letter in your first name: " + Firstname.charAt(Firstname.length() - 1));

	}

}
