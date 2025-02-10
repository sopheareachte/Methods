/*
 * Sopheareach Te
 * Feb 05, 2025
 * Means.java
 * Prompt user for three numbers
 * Calculate Arithmetic Mean and print it
 * Calculate Geometric Mean and print it
 * Calculate Harmonic Mean and print it
 * 
 */

import java.util.Scanner;

public class Means {
	
	//Calculate arithmetic mean of three numbers
	public static double arithmeticMean(double firstNumber, 
		double secondNumber, double thirdNumber) {

		return (firstNumber + secondNumber + thirdNumber) / 3;
	}
	
	//Calculate geometric mean of three numbers
	public static double geometricMean(double firstNumber, 
		double secondNumber, double thirdNumber) {
			
		return Math.pow(firstNumber * secondNumber * thirdNumber, 
			1.0 / 3.0);
	}
	
	//Calculate the reciprocal of a number
	public static double reciprocal(double x) {
		return 1.0 / x;
	}
	
	//Calculate harmonic mean of three numbers
	public static double harmonicMean(double firstNumber, 
		double secondNumber, double thirdNumber) {
			
		double firstReciprocal = reciprocal(firstNumber);
		double secondReciprocal = reciprocal(secondNumber);
		double thirdReciprocal = reciprocal(thirdNumber);
		
		double arithmeticMeans = arithmeticMean(firstReciprocal,
								secondReciprocal, thirdReciprocal);
		 		
		return reciprocal(arithmeticMeans);
	}
	
	public static void main (String[] args) {
		
		//prompt user for three numbers for calculations
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double firstNumber = input.nextDouble();
		System.out.print("Enter second number: ");
		double secondNumber = input.nextDouble();
		System.out.print("Enter third number: ");
		double thirdNumber = input.nextDouble();
		
		//call arithmeticMean to do calculation and print it
		System.out.printf("Arithmetic mean: %.2f%n", 
				arithmeticMean(firstNumber, secondNumber, thirdNumber));
				
		//call geometricMean to do calculation and print it		
		System.out.printf("Geometric mean:  %.2f%n", 
				geometricMean(firstNumber, secondNumber, thirdNumber));
				
		//call harmonicMean to do calculation and print it
		System.out.printf("Harmonic mean:   %.2f%n", 
				harmonicMean(firstNumber, secondNumber, thirdNumber));
		
	}
	
	
}

