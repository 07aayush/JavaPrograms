package com.bl.ObjectOrientedPrograms;

import com.bl.utility.Util;

public class DeckOfCard {

	/**
	 * Program ​ :DeckOfCards.java ​ ,
	 * purpose : to initialize deck of cards having suit ("Clubs",
	 * "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10",
	 * "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random method and then
     * distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players.
	 * @param args
	 */
	public static void main(String[] args)
	{

		String playercard[][]=Util.cardDistribute();

		//System.out.println("Player 1      Player 2       Player 3        Player 4");
	
		int x=0;
		int y=0;
		for(int i=0;i<4;i++)
		{
			System.out.print("player "+(i+1)+":\t");
			
			for(int j=0;j<9;j++)
			{
				
				System.out.print(playercard[x][y]+"\t");
				y++;
				if(y==9)
				{
					y=0;
					x++;
				}
				//System.out.println();
			}
			System.out.println();
		}

	}
}