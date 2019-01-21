package com.bl.DataStructures;

import com.bl.utility.Util;

public class TestMyStack {

	public static void main(String[] args)
	{
		String s; 	//blank String
		int counter=0; //instance variable a counter 
		System.out.println("Enter the String to check paranthesis balanced OR not" );
		s = Util.getString();
		char[] c= s.toCharArray();
		MyStack<Character> m=new MyStack<Character>();	
		for(int i=0; i<s.length() ;i++)
		{
			//if '(' comes of String we push the elements to stack 
			if( c[i]=='(')
			{
				m.push(c[i]);
				counter++;       //increase count
				System.out.print(counter+" ->"); 
			} 
			else
				//if ')' comes we pop the elements from stack 
				if( c[i]==')' )
				{	
					m.pop();
					counter--;   //decrease the count when pop happens
				
					System.out.print(counter+" ->");
				}
			System.out.print("");
		}
		if(counter==0)
		{
			
			System.out.println("\n it is Balanced parathesis");
		}
		else
		{
			System.out.println("it is not Balanced parathesis");
		}
	}
}

