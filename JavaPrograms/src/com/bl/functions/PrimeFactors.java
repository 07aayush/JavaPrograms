package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class PrimeFactors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the num");
		int input = sc.nextInt();
		
		util.primeFactors(input);

}
}