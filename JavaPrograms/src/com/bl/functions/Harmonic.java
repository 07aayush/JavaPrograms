package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.Util;

public class Harmonic {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		String input;
		do {
			System.out.println("enter the valid number");
			input = sc1.next();
		}while(!Util.isNumber(input));
		int number = Integer.parseInt(input);
		System.out.println("the harmonic number is :"+Util.nthHarmonic(number));
		sc1.close();
		}

}