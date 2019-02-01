package com.bl.DesignPatterns;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {
		// TODO Auto-generated constructor stub
	}
	public static synchronized ThreadSafeSingleton getInstance()
	{
		if(instance == null)
		{
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	public static ThreadSafeSingleton getInstnce()
	{
		if(instance== null)
		{
			synchronized (ThreadSafeSingleton.class) {
				if(instance== null)
					instance = new  ThreadSafeSingleton();
			}
			
		}
		return instance;
	}
}
