package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class Harmonic {

	public static void main(String[] args) {
	 
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("enter the harmonic number ");
		int input = sc1.nextInt();
		System.out.println("the nth harmonic found is: "+util.nthHarmonic(input));
	}

}
