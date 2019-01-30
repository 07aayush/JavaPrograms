package com.bl.ObjectOrientedPrograms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

class StockAccount {

	List<Stocks> stocklist=new ArrayList<>();
	List<String> transition=new ArrayList<>();
	int amount;
	

	public StockAccount()
	{
		
	}
	
	public StockAccount(String name)
	{
		if(!new File("/home/bridgelabz/Desktop/"+name+".json").exists())
		{
			FileOutputStream file;
			this.amount=10000;
			try
			{
				file = new FileOutputStream("/home/administrator/Desktop/StockAccountDetails/"+name+".json");
				new ObjectMapper().writeValue(new File("/home/administrator/Desktop/StockAccountDetails/"+name+".json"), this);
				file.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Person Exists");
		}
	} 
}