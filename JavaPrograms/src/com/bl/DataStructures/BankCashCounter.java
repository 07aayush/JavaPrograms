package com.bl.DataStructures;

import java.util.Scanner;

public class BankCashCounter {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		//balance in bank===>every person
		int amount,balance=10000;

		//take i/p for the nos of people
		System.out.println("Enter the nos of people in a queue" );	
		int n= sc.nextInt();

		//HERE we pass the size i.e nos tof people to {Mystack ---size method }
		MyQueue<Object> m=new MyQueue<Object>(n);	

		/**
		 * to i/p names of nos of people in Queue
		 */
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the name of "+i +" person");
			String name= sc.next();

			//PUSH the name in the Myqueue
			boolean t =m.enqueue(name); 	

			if(t==false) //to check name inserted or not
			{
				System.out.println("person not added");
			}

		}
		System.out.println("====================================================");

		System.out.println("\n"+"the people in Queue r as follow:" );
		System.out.println( m.toString() );

		/**
		 * perForming operation for each Person like dequeue etc
		 */
		for(int i=0;i<n;i++)
		{
			System.out.println("**********Welcome: person no: "+ i);

			System.out.println("\n"+"the Current QUEUE is: "+ m.toString());

			System.out.println("please choose the option: 1)Deposit 2)Withdraw");
			int ch =sc.nextInt();

			//switch case--->to perform opration for particular person
			switch(ch)
			{
			case 1: System.out.println("Deposit Money in account---plz eneter amount"); 
			amount=sc.nextInt();

			balance= balance + amount; 

			System.out.println("New balance is: "+balance);
			break;

			case 2: System.out.println("Withdraw Money in account---plz eneter amount"); 
			amount=sc.nextInt();

			balance= balance - amount; 

			System.out.println("New balance is: "+balance);
			break;
			
			default :
				System.out.println("enter valid input");
			 
			}
			//####NOTE-
			//Now he ith person finsed work
			//Now he is dequed from the QUEUE---by using dequeue method
			m.dequeue(); //it is---->Myqueue method

			System.out.println("------------Thankyou----------");
			System.out.println("---------next person----------");
			sc.close();
		}
	}



}




