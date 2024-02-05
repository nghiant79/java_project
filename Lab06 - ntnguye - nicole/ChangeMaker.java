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
 * @author Nghia Nguyen & Nicole Herrera
 *
 */
public class ChangeMaker
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int price;

		System.out.println("Input your price: ");
		price = key.nextInt();

		// If user input invalid data
		if (price < 25)
			System.out.println("Cost is invalid it must be at least 25 cents");

		if (price > 100)
			System.out.println("Cost is invalid - it must be no more than 100 cents");

		if ((price % 5) != 0)
			System.out.println("Cost is invalid - it must be evenly divisible by 5");

		// Declare the variables
		int change, quarter, dime, nickel;

		change = 100 - price;

		if ((price > 25) && (price < 100) && (price % 5 == 0))
		{
			System.out.println("You bought an item for" + price + " cent and gave me 1 dollar ");
			System.out.println("Your change is: ");
			quarter = change / 25; // Calculate quarter
			if (quarter == 1)
				System.out.println("1 quarter");
			else if (quarter > 1)
				System.out.println(quarter + " quarters");

			change = change % 25; // Calculate the remaining change
			dime = change / 10; // Calculate dime
			if (dime == 1)
				System.out.println("1 dime");
			else if (dime > 1)
				System.out.println(dime + " dimes");

			change = change % 10; // Calculate the remaining change
			nickel = change / 5; // Calculate nickel
			if (nickel == 1)
				System.out.println("1 nickel");
			else if (nickel > 1)
				System.out.println(nickel + " nickels");
		}

	}

}
