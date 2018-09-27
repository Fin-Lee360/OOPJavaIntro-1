/*
 * Sol Campbell 27/09/2018
 * Version 2.1 of pontoon
 */
package pontoonV2;

import java.util.Scanner;

public class Player 
{
	
	Scanner kboard = new Scanner(System.in);
	
	private int card1;		// declarations
	private int card2;
	static int total;		//static so can be used throughout
	private int cardNew;
	private String choice;
	
	public Player() // constructor
	{
		this.getcard1Value();
		this.getcard2Value();
	}
	
	public void display() // displays and determines the players finishing hand
	{
		System.out.println("Your cards are " +card1+ " and " +card2+".");
		total = card1 + card2;
		System.out.println("Your total is " +total+".");
		System.out.println("Would you like a new card? Y/N");
		choice = kboard.next();	
		if (choice.equalsIgnoreCase("y"))
		{
			do
			{
				this.getcardNewValue();
				this.getTotal();				
				System.out.println("Would you like a new card? Y/N");
				choice = kboard.next();	
				if ((choice.equalsIgnoreCase("y")) && total>21)
				{
					System.out.println("You cannot take a card if your total is above 21.");
				}
			}while ((choice.equalsIgnoreCase("y")) && total<22); // lets the player 'draw' new cards until they stop or go bust
		}
	}
	
	public void getcard1Value() // generates a card for player
	{
		card1 = (int)(Math.random()*10)+1;
	}
	
	public void getcard2Value() // generates a second card for player
	{
		card2 = (int)(Math.random()*10)+1;
	}
	
	public void getcardNewValue() // generates a new card if needed
	{
		cardNew = (int)(Math.random()*10)+1;
		System.out.println("Your new card is " +cardNew);
	}	
	
	public void getTotal() // determines the total for the players hand.
	{
		total = total + cardNew;
		System.out.println("Your total is " +total+".");
	}
	
	public static int getPlayerTotal() // allows the players total to be accessed in other classes
	{
		return total;
	}
}
