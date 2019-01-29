package com.bl.DataStructures;

import java.util.Scanner;

import com.bl.utility.Util;

public class PrintCalander {

	public static void main(String[] args) {
	
Util util = new Util();
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter month : ");
	int month = sc.nextInt();
	System.out.println("Enter year : ");
	int year = sc.nextInt();
	util.printCalender(month, year);
	sc.close();
}
}