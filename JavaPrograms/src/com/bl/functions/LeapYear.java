package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the year");
		int enter_Year = sc.nextInt();
		
	util.checkYear(enter_Year);
	}

}
