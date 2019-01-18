package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.Util;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year (4-digits)");
		String enter_Year = sc.nextLine();
		char year[]=enter_Year.toCharArray();	
		for(int i=0;i<year.length;i++)
		{
			while(Character.isAlphabetic(year[i]) || year.length < 4)
			{
				System.out.println("enter the Valid year");
				enter_Year = sc.nextLine();
				year=enter_Year.toCharArray();
			}
		}
		int year1=Integer.parseInt(enter_Year);
		Util.checkYear(year1);
		sc.close();

	}

}
