package com.bl.ObjectOrientedPrograms;

import com.bl.DataStructures.Queue;
import com.bl.utility.Util;

public class SortDeckOfCards 
{
	/**
	 * Extended the program of "Deck Of Cards"  to create a Player Object having Deck of Cards, and
	 * Having ability to Sort by Rank and maintain the cards in a Queue implemented using
	 * Linked List. Do not use any Collection Library. Further the Player are also arranged
	 * in Queue. Finally Print the Player and the Cards received by each Player.
	 * @param args
	 */
	public static void main(String[] args)
	{
		String playercard[][]=Util.cardDistribute();

		Queue<Queue<String>> sortedcard=Util.cardSort(playercard);
		String playername[]= {"Player 1","Player 2","Player 3","Player 4"};
		int index=0;
		while(!sortedcard.isEmpty())
		{
			Queue<String> temp=sortedcard.dequeue();
			System.out.print(playername[index]+"--> ");
			while(!temp.isEmpty())
			{
				System.out.print(temp.dequeue()+"  ");
			}
			System.out.println();
			index++;
		}	

}
}
