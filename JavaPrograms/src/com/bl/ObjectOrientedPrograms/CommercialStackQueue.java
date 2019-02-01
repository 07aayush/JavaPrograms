package com.bl.ObjectOrientedPrograms;

import java.util.Scanner;

public class CommercialStackQueue {

	/**
	 * commercial Stack using Queue
	 * Further maintain DateTime of the transaction in a Queue implemented using Linked
	 * List to indicate when the transactions were done.
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		CommercialStackMethods stock = new CommercialStackMethods();
		char ch;
		System.out.println("****Welcome to Stock Market****");
		do
		{
			System.out.println("Enter What you wants to do\n1. Add Details\t2. Buy\t3. Sell\t4. Print Report ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 : 
					stock.addDetails();
					break;
				case 2 : 
					stock.buyStock();
					break;
				case 3:
					stock.sellStock();
					break;
				case 4 : 
					stock.printReport();
					break;							
				default :
					System.out.println("Invalid Choice..!!!");
					break;			
			}
			System.out.println("Do you wants to continue...(Y/N)");
			ch = sc.next().charAt(0);
		}while(ch=='Y' || ch == 'y');
	}
}
