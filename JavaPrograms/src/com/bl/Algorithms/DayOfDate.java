package com.bl.Algorithms;

import com.bl.utility.Util;

public class DayOfDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("0-sunday , 1-monday , 2-tuesday , 3-wednesday , 4-thursday , 5-friday , 6-saturday");

		if(args.length==0 || args.length<3)
		{
			System.out.println("enter month day year ");
			return;
		}

		int month,day,year,weekDay;

		month = Integer.parseInt(args[0]);
		day =Integer.parseInt(args[1]);
		year = Integer.parseInt(args[2]);

		weekDay=Util.dayOfWeek(month,day,year);
		System.out.println();
		System.out.println("given date : "+month+ ":"+day+ ":"+year);
		System.out.println();
		System.out.println("given day is "+weekDay);
	}

}
