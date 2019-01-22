package com.bl.DataStructures;

import java.util.Scanner;

public class BankCashCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//take int,amt as  int for keeping particular persons amount
		int amount,balance = 1000;

		//take no of people in the queue
		System.out.println("enter number of people you want in Queue");
		int n = sc.nextInt();

		//create the implemented Queue object and then pass it to the no of ppl  for enqueuing
		MyQueue<Object> queue = new MyQueue<Object>(n);

		//imput names of people
		for(int i = 1;i<=n;i++)
		{
			System.out.println("Enter the name of "+i +" person");
			String name= sc.next();

			//PUSH the name in the Myqueue
			boolean t =  queue.enqueue(name);	

			if(t==false) //to check name inserted or not
			{
				System.out.println("person not added");
			}

		}

		System.out.println("///////////////////////////////////////////////////");

		System.out.println("\n"+"The people in Queue are as follows:" );
		System.out.println( queue.toString() );

		/**
		 * perForming operation for each Person like dequeue etc
		 */
		{

			for(int i=1;i<n;i++)
			{
				System.out.println("Welcome: person no: "+ i);

				System.out.println("\n"+"the Current QUEUE is: "+ queue.toString());

				System.out.println("please choose the option: 1)Deposit 2)Withdraw");
				int ch =sc.nextInt();

				//switch case--->to perform opration for particular person
				switch(ch)
				{
				case 1: System.out.println("Deposit Money in account plz enter amount"); 
				amount=sc.nextInt();

				balance= balance + amount; 

				System.out.println("New balance is: "+balance);
				break;

				case 2: System.out.println("Withdraw Money in account plz enter amount"); 
				amount=sc.nextInt();

				if(amount>balance)
				{
					System.out.println("not enough balance to withdraw");
				}
				else
				{			 
					balance= balance - amount; 
					System.out.println("New balance is: "+balance);
				}		 
				break;
				default : 
					System.out.println("enter valid case");
				}
				queue.dequeue(); //it is---->Myqueue method
				System.out.println("------------Thankyou----------");
				sc.close();

			}

		}
	}


}



