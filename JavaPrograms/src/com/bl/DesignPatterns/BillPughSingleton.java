package com.bl.DesignPatterns;

public class BillPughSingleton {

	private  BillPughSingleton() {
		// TODO Auto-generated constructor stub
	}
	public static class SingletonHelper
	{
		private static final BillPughSingleton instance = new BillPughSingleton();
		
	}
	public static BillPughSingleton getInstance()
	{
		return SingletonHelper.instance;
	}
	
}
