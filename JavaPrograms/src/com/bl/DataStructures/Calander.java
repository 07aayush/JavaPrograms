package com.bl.DataStructures;
import com.bl.utility.Util;

public class Calander {

	static int n =1;
	public static void main(String[] args) {
		
		int month = Integer.parseInt(args[0]);
		int year =  Integer.parseInt(args[0]);
		int day = 23;
	//	System.out.println("Month: "+month+"   Year: "+year);


		//method to find DAY---for which the inputs are given By USER
		int count= Util.calander(day,month,year);

		//Days of week a ARRAY is Char created 
		char c[]= {'S' ,'M' ,'T' ,'W' ,'T' ,'F' ,'S'};


		//display the DAYS 
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"\t");
		}


		System.out.println("\n");

		//int Array to display Calendar in 2D format
		int arr[][]=new int[5][7];


		//int Array to check and take END date---Of the give input month
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//condition for checking year is a leap year are not
		if( year%4==0 && year%100!= 0  ||  year%400==0)
		{
			days[1] = 29;
		}
/**
		 * For loop the DISPLAY the Calendar in 2D format
		 */
		for(int i=0;i<=5;i++) //Weeks
		{
			for(int j=0;j<=6;j++) //days
			{ 
				//count--->is the DAY  for which the inputs are given By USER
				if(i==0 && j<count) 
				{
					System.out.print("\t"+"");
				}

				if(i==0 && j>=count )
				{
					System.out.print(n+"\t");
					n++;
				}

				if(i==1)
				{ 
					System.out.print(n+"\t");
					n++;
				}
				if(i>=2 && n<= days[month-1])
				{
					System.out.print(n+"\t");
					n++;
				}

			}
			System.out.println();
		}
	}
}
