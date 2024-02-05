
/*
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

public class MileageCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Input the gallons of gas used: ");
		int gallons_of_gas_used = keyboard.nextInt();

		System.out.println("Input the miles traveled: ");
		int miles_traveled = keyboard.nextInt();

		float Miles_per_Galons;
		Miles_per_Galons = (float) miles_traveled / gallons_of_gas_used;

		System.out.println("the miles per gallon for the trip: " + Miles_per_Galons);

	}

}
