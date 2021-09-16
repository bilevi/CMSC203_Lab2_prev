/*
 Class: CMSC203 CRN 21455
 Program: Lab 2
 Instructor: Professor Alexander
 Summary of Description: A test program for fixing errors
 Due Date: 09/16/2021
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
B. Leigh Vining
 */

/**
This program demonstrates how numeric types and operators behave in Java
Do Task #1 before adding Task#2 where indicated.
*/
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		
		//TASK #2 Create a Scanner object here 
		Scanner input = new Scanner(System.in);
		
		//identifier declarations
		final int NUMBER = 2 ; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
	
		//Task #2 declare a variable to hold the user�s temperature
		int Fahrenheit;
		
		//Task #2 prompt user to input score1
		System.out.print("Enter the first score: ");
		//Task #2 read score1 
		score1 = input.nextInt();
		//Task #2 prompt user to input score2
		System.out.print("Enter the second score: ");
		//Task #2 read score2 
		score2 = input.nextInt();
		
		// Find an arithmetic average
		average = (double)(score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		//Task #2 prompt user to input another temperature
		System.out.print("Enter a temperature in Fahrenheit: ");
		//Task #2 read the user�s temperature in Fahrenheit
		Fahrenheit = input.nextInt();
		
		//Task #2 convert the user�s temperature to Celsius
		fToC = (5.0/9.0) * (Fahrenheit - 32);
		//Task #2 print the user�s temperature in Celsius
		System.out.println(Fahrenheit + " in Fahrenheit is " + fToC + " in Celsius.");
		
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
