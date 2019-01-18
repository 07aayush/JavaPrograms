package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.Util;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input;

		do {
			System.out.println("enter the valid number num");
			input = sc.next();
		}while(!Util.isNumber(input));
		int number = Integer.parseInt(input);
		Util.primeFactors(number);
		sc.close();

	}

}
