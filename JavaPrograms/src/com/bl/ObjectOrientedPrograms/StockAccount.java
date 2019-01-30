package com.bl.ObjectOrientedPrograms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
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
				file = new FileOutputStream("/home/bridgelabz/Desktop/"+name+".json");
				new ObjectMapper().writeValue(new File("/home/bridgelabz/Desktop/"+name+".json"), this);
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
	
	public StockAccount(String name,int x)
	{
		try
		{
			ObjectMapper ob=new ObjectMapper();
	
		StockAccount persontemp=(StockAccount)ob.readValue(new File("/home/bridgelabz/Desktop/"+name+".json"),new TypeReference<StockAccount>() {});
	
		this.stocklist=persontemp.stocklist;

		this.transition=persontemp.transition;
		
		this.amount=persontemp.amount;
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
			
	}
	public List<Stocks> getStocklist() {
		return stocklist;
	}
	public void setStocklist(List<Stocks> stocklist) {
		this.stocklist = stocklist;
	}
	public List<String> getTransition() {
		return transition;
	}
	public void setTransition(List<String> transition) {
		this.transition = transition;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void buy(String symbol,int numberOfShare,String  nameLogin)
	{
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
