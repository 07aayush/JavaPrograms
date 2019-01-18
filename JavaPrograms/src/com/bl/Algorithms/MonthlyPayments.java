package com.bl.Algorithms;

import com.bl.utility.Util;

public class MonthlyPayments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length < 3)
		{
			System.out.println("enter minimum 3 inputs");
		}
		else
		{
		
		Double Principle;
		Double Year;
		Double RateOfInterest;
		Double payment;
		
		try {
		Principle=Double.parseDouble(args[0]);
		Year=Double.parseDouble(args[1]);
		RateOfInterest=Double.parseDouble(args[2]);
		
		payment = Util.monthlyPayment(Principle, Year, RateOfInterest);
		System.out.println("given:\n Princple = "+Principle+"\n Year = "+Year+" years "+"\n RateOfIntrest = "+RateOfInterest +"%");
		System.out.printf("\nMonthly Payment : %.2f",payment);
		}
		catch(NumberFormatException e)
			{
				System.out.println("Enter three valid double as inputs " + e.getMessage());
			}
		
	}

}
}
