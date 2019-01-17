package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class Distinctnums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		do {
			System.out.println("enter the valid number");
			input = sc.next();
		}while(!util.isNumber(input));
		int number = Integer.parseInt(input);
		util.randomNumberGeneration(number);
		sc.close();
	}

}
