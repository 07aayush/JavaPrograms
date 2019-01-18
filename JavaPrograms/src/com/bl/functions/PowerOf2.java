package com.bl.functions;

import com.bl.utility.Util;

public class PowerOf2 {

	public static void main(String[] args) {

		if(args.length < 1)
		{
			System.out.println("enter an input");
		}
		else
		{
			int y;
			try {
				y = Integer.parseInt(args[0]);
				if(y>=0&&y<31)
					System.out.println("enter the no to calc your power");
				else
					System.out.println("overflow occured ");
				Util.powerOfTwo(y);

			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter number as input " + e.getMessage());
			}
		}

	}

}

