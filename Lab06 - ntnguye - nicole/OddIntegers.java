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
public class OddIntegers
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		String text;
		
		text = key.next();
		
		int n = text.length();
		for (int i = n -1 ; i >=0 ; i--)
		{
			System.out.print(text.charAt(i));
			
		}
	}

}
