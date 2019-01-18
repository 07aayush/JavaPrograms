package com.bl.functions;

import com.bl.utility.Util;

public class WindChill {

	public static void main(String[] args) {

		if(args.length < 2)
		{
			System.out.println("please enter 2 inputs");
		}
		else
		{
			double x;
			double y;
			try {
				x = Double.parseDouble(args[0]);
				y = Double.parseDouble(args[1]);
				double windchill = Util.windChill(x, y);
				System.out.println("windchill =" +windchill);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter two numbers as inputs " + e.getMessage());
			}
		}

	}

}


