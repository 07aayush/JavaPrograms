package com.bl.functions;

import com.bl.utility.util;

public class Distance {

	public static void main(String[] args) {

		
        double x = Double.parseDouble(args[0]);

        double y = Double.parseDouble(args[1]);
       
        
       double distance = util.EuclideanDistance(x, y);
       
       System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);

	}

}
