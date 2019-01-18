package com.bl.Algorithms;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.bl.utility.Util;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double num;
		double sqrtVal;
		do {
			System.out.println("Enter a non- negative number...!");
			num = sc.nextDouble();
			}
		while(num < 0);
		sqrtVal = Util.sqrt(num);
		DecimalFormat df = new DecimalFormat(".###");
		System.out.println("Square root of "+num + " : "+df.format(sqrtVal));
		sc.close();

	}
}


