/*
 * Sol Campbell 27/09/2018
 * Version 2.0 of pontoon
 */
package pontoonV2;

public class GameLauncher 
{

	public static void main(String[] args) 
	{

		Player player1 = new Player();
		player1.display();
		
		Dealer dealer = new Dealer();
		dealer.dealer();

		if ((player1.total > dealer.dealerTotal) && (player1.total < 22))
		{
			do
			{
				dealer.getDealerTotal();
			}while ((player1.total > dealer.dealerTotal)&& (player1.total < 22));  // lets the dealer 'draw' until he beats or matches the player, or goes bust
		}
		
		// if else statements determine who the winner is
		
		if (player1.total>21)
		{
			System.out.println("You are bust. You lose.");
		}
		else if (player1.total == dealer.dealerTotal)
		{
			System.out.println("You both have the same card. Dealer wins on a draw.");
		}
		else if ((player1.total>21) && dealer.dealerTotal>21)
		{
			System.out.println("you are both bust. Dealer wins on a draw.");
		}
		else if ((player1.total<dealer.dealerTotal) && (dealer.dealerTotal < 22))
		{
			System.out.println("Dealer has " +dealer.dealerTotal+ ". You lose.");
		}
		else if ((player1.total>dealer.dealerTotal) && (player1.total<22))
		{
			System.out.println("Dealer has " +dealer.dealerTotal+ ". You win.");
		}
		else if ((dealer.dealerTotal>21) &&  (player1.total < 22))
		{
			System.out.println("Dealer is bust on " +dealer.dealerTotal+ ", and you are not. You win.");
		}

	}
}
