package com.bl.ObjectOrientedPrograms;

import java.util.Scanner;

import com.bl.utility.Util;

public class TestStockAccount 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Util input = new Util();
		 int ans = 0;
		 do
		 {
			 System.out.println("press 1 to create account");
			 System.out.println("press 2 to login");
			 System.out.println("press 3 to exit ");
			 ans = sc.nextInt();
			 switch(ans)
			 {
			 case 1: 
				 String name = sc.nextLine();
			
				break;
				
			 case 2:
				System.out.println("enter name");
				String inputname = sc.next();
				
				
			 }
		 }
		 
	}
	

}
