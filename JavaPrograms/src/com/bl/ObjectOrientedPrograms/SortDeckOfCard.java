package com.bl.ObjectOrientedPrograms;

import com.bl.DataStructures.MyQueue;
import com.bl.utility.Util;

public class SortDeckOfCard {

	public static void main(String[] args) 
	{
		String playercard[][]=Util.distributeCards();
		
		MyQueue<MyQueue<String>> sortedcard=Util.sortCard(playercard);
		String playername[]= {"Player 1","Player 2","Player 3","Player 4"};
		int index=0;
		while(!sortedcard.isempty())
		{
			@SuppressWarnings("unchecked")
			MyQueue<String> temp=(MyQueue<String>) sortedcard.dequeue();
			System.out.print(playername[index]+"--> ");
			while(!temp.isempty())
			{
				System.out.print(temp.dequeue()+"  ");
			}
			System.out.println();
			index++;
		}	
		
	}
}

