package com.bl.ObjectOrientedPrograms;

import java.util.Scanner;

public class CommercialLL {

	/**
	 * Maintain the List of CompanyShares in a Linked List So new CompanyShares can
	 * be added or removed easily using custom Linked List
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		CommercialLLMethods stock = new CommercialLLMethods();
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
					stock.linkedlist();
					break;
				case 3:
					stock.sellStock();
					stock.linkedlist();
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
