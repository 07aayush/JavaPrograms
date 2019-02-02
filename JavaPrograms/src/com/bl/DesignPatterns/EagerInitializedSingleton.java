package com.bl.DesignPatterns;

public class EagerInitializedSingleton {
	  private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	    
	    //private constructor to avoid client applications to use constructor
	    private EagerInitializedSingleton(){}

	    public static EagerInitializedSingleton getInstance(){
	        return instance;
	    }
	    public static void main(String[] args)
	    {
	    	EagerInitializedSingleton instance = new EagerInitializedSingleton();
	    	EagerInitializedSingleton inst = new  EagerInitializedSingleton();
	    	//System.out.println("is instance == inst " +(instance.hashCode() inst.hashCode()));
	    	System.out.println(inst.hashCode());
	    	System.out.println(instance.hashCode());
	    }
}
