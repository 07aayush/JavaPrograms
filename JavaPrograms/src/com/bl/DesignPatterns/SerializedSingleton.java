package com.bl.DesignPatterns;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	public static final long serialVersionUID =7604766932017737115L;
	 private SerializedSingleton(){}
	    
	    private static class SingletonHelper{
	        private static final SerializedSingleton instance = new SerializedSingleton();
	    }
	    
	    public static SerializedSingleton getInstance(){
	        return SingletonHelper.instance;
	    }
	    public static void main(String[] arsg)
	    {
	    	SerializedSingleton n = new SerializedSingleton();
	    	System.out.println(n == getInstance());
	    }
}
