/*
 Class: CMSC203 CRN 21455
 Program: Lab 2
 Instructor: Professor Alexander
 Summary of Description: A program to find the volume of a sphere given a diameter
 Due Date: 09/16/2021
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
B. Leigh Vining
 */

import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double diam;
		double radius;
		double volume;
		
		System.out.println("This program will help to calculate the volume of a sphere");
		
		System.out.println("\nEnter the diameter of the sphere: ");
		diam = input.nextDouble();
		
		radius = diam / 2;
		volume = (4/3.0) * Math.PI * Math.pow(radius, 3);
		
		System.out.println("The volume of the sphere with radius " + radius + " is " + volume);
	}
}
