/**
 * 	Description: Program to read in Stock Names, Number of Share, Share Price.
 * 	Print a Stock Report with total value of each Stock and the total value of Stock.
 * 	I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of
 *	Share, and Share Price
 * 	Logic -> Calculate the value of each stock and the total value
 *	O/P -> Print the Stock Report. 
 */
package com.bl.ObjectOrientedPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bl.utility.Util;

public class StocksPortfolio {

	private List<Stocks> stocks;
	/**
	 * gives the number of stocks
	 * @return total number of stocks in the share market
	 */
	public double getTotalStocks() {
		long totalStocks = 0L;
		for (int i = 0; i < stocks.size(); i++) {
			totalStocks += stocks.get(i).getNumberOfShares();
		}
		return totalStocks;
	}

	/**
	 * gives total stock value of all the stocks in the share market
	 * @return total stock value of all the stocks
	 */
	public double getTotalStockValue() {
		long totalStockValue = 0L;
		for (int i = 0; i < stocks.size(); i++) {
			totalStockValue += stocks.get(i).getTotalStockValue();
		}
		return totalStockValue;
	}

	/**
	 * get all the stocks
	 * @return list of stocks
	 */
	public List<Stocks> getStocks() {
		return stocks;
	}

	/**
	 * set the stocks
	 * @param stocks list of stocks
	 */
	public void setStocks(List<Stocks> stocks) {
		this.stocks = stocks;
	}
	/**
	 * Testing the StockPortfolio class
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		List<Stocks> stocks =  new ArrayList<>();
		System.out.println("Enter the number of stocks...!");
		@SuppressWarnings("unused")
		int numOfStocks = Util.readPositiveInt();
		System.out.println("Enter the Stock Name...!");
		String name = Util.getString();
		System.out.println("Enter number of shares...!");
		int  numOfShares = Util.readPositiveInt();
		System.out.println("Enter the share price...!");
		double price = Util.getDouble();
		Stocks stock = new Stocks();
		stock.setStockName(name);
		stock.setNumberOfShares(numOfShares);
		stock.setPriceOfStock(price);
		stocks.add(stock);
		StocksPortfolio portfolio = new StocksPortfolio();
		portfolio.setStocks(stocks);
		System.out.println("\t Name\t\t Total_Stocks \t Share_Price \t Stock_Value");
		for(Stocks s : portfolio.getStocks()) 
		{
			System.out.println("\t "+s.getStockName()+"\t\t\t"+s.getNumberOfShares()+"   \t"+s.getPriceOfStock()+"  \t\t"+s.getTotalStockValue());
		}
		System.out.println("\n Total Stock Value = "+portfolio.getTotalStockValue());
		sc.close();
	}
}