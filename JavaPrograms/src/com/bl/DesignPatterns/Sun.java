package com.bl.DesignPatterns;

public class Sun {

	private Sun() {
		// TODO Auto-generated constructor stub
	}
	public static Sun obj = null;
	public static Sun getInstance()
	{
		if(obj==null)
		{
			obj=new Sun();
		}
		return obj;
	}
	
	public static void main(String[] args)
	{
		Sun sun1 = new Sun(); //new obj
		Sun sun2 = new Sun();
		
		System.out.println("is s1 = s2 "+(sun1==sun2));
	}
	
}
