/*
 * Sol Campbell 27/09/2018
 * Version 2.1 of pontoon
 */
package pontoonV2;

public class Winner 
{
	int total = Player.getPlayerTotal();			// variables created using the totals from dealer and player
	int dealertotal = Dealer.getDealerFinal();
	
	public Winner()
	{
	 
	}
	 
	public void getWinners()	// displays who wins
	{

		 // if else statements determine who the winner is
			
		if (total>21)
		{
			System.out.println("You are bust. You lose.");
		}
		else if (total == dealertotal)
		{
			System.out.println("You both have the same card. Dealer wins on a draw.");
		}
		else if ((total>21) && dealertotal>21)
		{
			System.out.println("you are both bust. Dealer wins on a draw.");
		}
		else if ((total<dealertotal) && (dealertotal < 22))
		{
			System.out.println("Dealer has " +dealertotal+ ". You lose.");
		}
		else if ((total>dealertotal) && (total<22))
		{
			System.out.println("Dealer has " +dealertotal+ ". You win.");
		}
		else if ((dealertotal>21) &&  (total < 22))
		{
			System.out.println("Dealer is bust on " +dealertotal+ ", and you are not. You win.");
		}
	}
}
	