package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class Quadratic {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 3 inputs for 'a' , 'b', and 'c'...!" );
		
		String a;
		do {
			System.out.println("Enter valid 'a' value");
			a = sc.next();
		}while(!util.isNumber(a));
		double input1 = Double.parseDouble(a);
       
		String b ;
		do {
			System.out.println("Enter valid 'b' value");
			b = sc.next();
		}while(!util.isNumber(b));
		double input2 = Double.parseDouble(b);	
		
		String c;
		do {
			System.out.println("Enter valid 'c' value");
			c = sc.next();
		}while(!util.isNumber(c));
		double input3 = Double.parseDouble(c);		
		
		
		System.out.println("Roots of "+a+"x*x + "+b+"x +"+c);
		double[] roots = util.quadraticRoots(input1, input2,input3 );
		if(roots != null) {
			for(double root : roots) {
				System.out.println(root);
				sc.close();
			}
		}
	}

}
