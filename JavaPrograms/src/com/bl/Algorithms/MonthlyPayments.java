package com.bl.Algorithms;

import com.bl.utility.Util;

public class MonthlyPayments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length<3)
		{
			System.out.println("enter principle, year,interest rate");
			return;
		}
		
		Double P;
		Double Y;
		Double R;
		Double payment;
		
		P=Double.parseDouble(args[0]);
		Y=Double.parseDouble(args[1]);
		R=Double.parseDouble(args[2]);
		
		payment = Util.monthlyPayment(P, Y, R);
		System.out.println("given:\n P = "+P+"\n Y = "+Y+" years "+"\n R = "+R +"%");
		System.out.printf("\nmonthly payment : %.2f",payment);
		
	}

}
