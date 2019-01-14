package com.bl.functions;

import java.util.Scanner;

import com.bl.utility.util;

public class Quadratic {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 3 inputs for 'a' , 'b', and 'c'...!" );
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.println("Roots of "+a+"x*x + "+b+"x +"+c);
		double[] roots = util.quadraticRoots(a, b, c);
		if(roots != null) {
			for(double root : roots) {
				System.out.println(root);
			}
		}
	}

}
