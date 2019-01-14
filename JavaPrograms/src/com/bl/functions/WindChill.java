package com.bl.functions;

import com.bl.utility.util;

public class WindChill {

	public static void main(String[] args) {
		
		double d =Double.parseDouble(args[0]);
		double e =Double.parseDouble(args[1]);
		
		double windchill =util.windChill(d, e);
		System.out.println("windchill= "+windchill);
		
	}

}
