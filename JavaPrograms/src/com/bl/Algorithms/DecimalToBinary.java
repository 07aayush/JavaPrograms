package com.bl.Algorithms;

import java.util.Scanner;

import com.bl.utility.Util;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int decimalNumber;
		do 
		{
			System.out.println("Enter a positive number...!");
			decimalNumber = Util.readPositiveInt();
		}
		while(decimalNumber <= 0);
		System.out.println("the binary number is "+Util.toBinary(decimalNumber));
		sc.close();
	}

}



