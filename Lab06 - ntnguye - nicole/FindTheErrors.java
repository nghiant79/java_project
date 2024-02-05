/*
 *  Created on 
 *
 *  ULID:  
 *  Class: IT 168
 *
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * The following class has four independent debugging problems. Solve one at a
 * time, uncommenting the next one only after the previous problem is working
 * correctly.
 *
 * @author
 *
 */
public class FindTheErrors
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		/*
		 * Problem 1 Debugging
		 * 
		 * This problem is to read in your first name, last name, and current year and
		 * display them in a sentence to the console.
		 */
		String firstName = "";
		String lastName = "";
		String school = "";
		int year = 0;

		System.out.print("Enter your first name:  ");
		firstName = keyboard.nextLine();

		System.out.print("Enter the current year:  ");
		year = keyboard.nextInt();

		System.out.print("Enter your last name:  ");
		lastName = keyboard.next();

		System.out.print("You are " + firstName + " " + lastName + " and it is the year " + year);

		keyboard.nextLine();
		System.out.println("\n");

		// * Problem 2 Debugging

		// * This problem is to assign a value to num2 based on the input value of num1.
		// * It should then print both numbers.

		int num1 = 0;
		int num2 = 0;

		System.out.print("Enter a number - 1, 2, or 3: ");
		num1 = keyboard.nextInt();

		if (num1 == 1)
			num2 = 2;
		else if (num1 == 2)
			num2 = 3;
		else if (num1 == 3)
			num2 = 4;

		System.out.println("num1 = " + num1 + " and num2 = " + num2);

		System.out.println("\n");

		/*
		 * Problem 3
		 * 
		 * This problem is to read the name of the course you are taking and display a
		 * statement showing the answer.
		 */
		String courseName = "";

		System.out.print("Enter your course name (IT168 or IT177): ");
		courseName = keyboard.next();

		if (courseName.equals("IT168"))
			System.out.println("You are taking IT168.");
		else if (courseName.equals("IT177"))
			System.out.println("You are taking IT177.");
		else
			System.out.println("Invalid input.");

		System.out.println("\n");

		/*
		 * Problem 4
		 * 
		 * This problem is to read a test grade from the keyboard and assign the
		 * appropriate letter grade.
		 */
		int score = 0;
		char grade;
		System.out.println("Enter your test grade (1-100): ");
		score = keyboard.nextInt();

		switch (score)
		{
		case (100): // From 91- 100 : Grade A
		case (99):
		case (98):
		case (97):
		case (96):
		case (95):
		case (94):
		case (93):
		case (92):
		case (91):
			grade = 'A';
			break;
		case (90): // From 81 - 90 : Grade B
		case (89):
		case (88):
		case (87):
		case (86):
		case (85):
		case (84):
		case (83):
		case (82):
		case (81):
			grade = 'B';
			break;
		case (80): // From 71 - 80: Grade C
		case (79):
		case (78):
		case (77):
		case (76):
		case (75):
		case (74):
		case (73):
		case (72):
		case (71):
			grade = 'C';
			break;
		case (70): // From 61 - 70 : Grade D
		case (69):
		case (68):
		case (67):
		case (66):
		case (65):
		case (64):
		case (63):
		case (62):
		case (61):
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("The score " + score + " will have a grade of " + grade + ".");

	}
}
