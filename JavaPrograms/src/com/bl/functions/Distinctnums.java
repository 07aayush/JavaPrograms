package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.Util;

public class Distinctnums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		do {
			System.out.println("enter the valid number");
			input = sc.next();
		}while(!Util.isNumber(input));
		int number = Integer.parseInt(input);
		Util.randomNumberGeneration(number);
		sc.close();
	}

}
