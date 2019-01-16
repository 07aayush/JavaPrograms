package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.utility.util;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter input number to convert the temperature from Celsius to fahrenheit");
		int input = sc.nextInt();
		System.out.println("to fahrenheit "+util.celsiusToFahrenheit(input));
		System.out.println();
		System.out.println("enter input number to convert the temperature from fahrenheit to celcius");
		int input2 = sc.nextInt();
		System.out.println("to celcius "+util.fahrenheitToCelsius(input2));
		
		
	}
	
	

}
