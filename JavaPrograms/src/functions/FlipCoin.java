package functions;

import java.util.Scanner;

import utility.util;

public class FlipCoin {

	public static void main(String[] args) { 
	Scanner sc1 = new Scanner(System.in);
	System.out.println("enter the no of times to flip count");
	int a = sc1.nextInt();
	if(a>0)
	{
		int[] d = util.Percentage(a);
		
		System.out.println("tail= "+d[0]);
		System.out.println("head= "+d[1]);
	}
	else
	{
		System.out.println("! add no grater then 0");
		
	}
	}

}
