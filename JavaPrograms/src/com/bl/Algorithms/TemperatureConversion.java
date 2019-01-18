package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.utility.Util;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter input number to convert the temperature from Celsius to fahrenheit");
		
		String input1;
		do {
			System.out.println("enter the valid number");
			input1 = sc.next();
		}while(!Util.isNumber(input1));
		double number = Double.parseDouble(input1);
		System.out.println("to fahrenheit "+Util.celsiusToFahrenheit(number));
		System.out.println();
		
		
		System.out.println("enter input number to convert the temperature from fahrenheit to celcius");
		do {
			System.out.println("enter the valid number");
			input1 = sc.next();
		}while(!Util.isNumber(input1));
		double number1 = Integer.parseInt(input1);
		System.out.println("to celcius "+Util.fahrenheitToCelsius(number1));
		sc.close();
		
		
	}
	
	

}
