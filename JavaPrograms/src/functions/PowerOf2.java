package functions;

import utility.util;

public class PowerOf2 {

	public static void main(String[] args) {

		

	        // read in one command-line argument
	        int n = Integer.parseInt(args[0]);

	        System.out.println("enter the no to calc your power");
	        if(n>=0&&n<31)
	        util.powerof2(n);
	        else
	        	System.out.println("overflow ");
	}
}
