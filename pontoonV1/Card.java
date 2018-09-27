package pontoonV1;

import java.util.Scanner;

public class Card 
{
	Scanner kboard = new Scanner(System.in);
	
	private int card1;
	private int card2;
	private int total;
	private int cardNew;
	private int dealerCard1;
	private int dealerCard2;
	private int dealerTotal;
//	private String suite;
//	private boolean drawn;
	private String choice;
	
	
	public Card()
	{
		this.getcard1Value();
		this.getcard2Value();
		this.getDealerCard();
	}
	
	public void display()
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
			}while ((choice.equalsIgnoreCase("y")) && total<22);
		}
		if (choice.equalsIgnoreCase("n") || total>21)
		{
			if ((dealerTotal<total)&&(total<22))
			{
				do
				{
					this.getDealerTotal();
				}while ((dealerTotal<total) && (total<22));
			}
			
			this.getCheckWin();
		}
	}
	
	public void getcard1Value()
	{
		card1 = (int)(Math.random()*10)+1;
	}
	
	public void getcard2Value()
	{
		card2 = (int)(Math.random()*10)+1;
	}
	
	public void getcardNewValue()
	{
		cardNew = (int)(Math.random()*10)+1;
		System.out.println("Your new card is " +cardNew);
	}	
	
	public void getTotal()
	{
		total = total + cardNew;
		System.out.println("Your total is " +total+".");
	}
	
	public void getDealerCard()
	{
		dealerCard1 = (int)(Math.random()*10)+1;
		dealerCard2 = (int)(Math.random()*10)+1;
		dealerTotal = dealerCard1 + dealerCard2;
	}
	
	public void getDealerTotal()
	{
		int dealernewCard = (int)(Math.random()*10)+1;
		dealerTotal = dealerTotal + dealernewCard;
		System.out.println(dealernewCard);
		System.out.println(dealerTotal);
	}
	
	public void getCheckWin()
	{
		if (total>21)
		{
			System.out.println("You are bust. You lose.");
		}
		else if ((total>21) && dealerTotal>21)
		{
			System.out.println("you are both bust. Dealer wins on a draw.");
		}
		else if ((total<dealerTotal) && (dealerTotal < 21))
		{
			System.out.println("Dealer has " +dealerTotal+ ". You lose.");
		}
		else if ((total>dealerTotal) && (total<22))
		{
			System.out.println("Dealer has " +dealerTotal+ ". You win.");
		}
		else if ((dealerTotal>21) &&  (total < 22))
		{
			System.out.println("Dealer is bust on " +dealerTotal+ ", and you are not. You win.");
		}
	}
}
