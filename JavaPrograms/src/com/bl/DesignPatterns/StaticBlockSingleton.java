package com.bl.DesignPatterns;

public class StaticBlockSingleton {
	
	private static  StaticBlockSingleton instance;
	
	public StaticBlockSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
    public static void main(String[] args)
    {
    	StaticBlockSingleton inst = new StaticBlockSingleton();//other obj
    	System.out.println("is instance == isnt" +(instance == inst));
    }
}
	
