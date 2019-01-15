package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class nthHarmonic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter the number:");
		int number = sc.nextInt();
		System.out.println("the nth harmonic found is: "+util.nthHarmonic(number));
		
	}

}
