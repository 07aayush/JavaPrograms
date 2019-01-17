package com.bl.functions;

import com.bl.utility.util;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 2)
		{
			System.out.println("enter 2 inputs");
		}
		else
		{
			double x;
			double y;
			try {
				x = Double.parseDouble(args[0]);
				y = Double.parseDouble(args[1]);
				double distance = util.euclideanDistance(x, y);
				System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter two numbers as inputs " + e.getMessage());
			}
		}

	}

}
