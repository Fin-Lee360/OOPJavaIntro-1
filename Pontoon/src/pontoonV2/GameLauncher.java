/*
 * Sol Campbell 27/09/2018
 * Version 2.1 of pontoon
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

		if ((Player.total > Dealer.dealerTotal) && (Player.total < 22))
		{
			do
			{
				dealer.getDealerTotal();
			}while ((Player.total > Dealer.dealerTotal)&& (Player.total < 22));  // lets the dealer 'draw' until he beats or matches the player, or goes bust
		}
		
		Winner whowins = new Winner();
		whowins.getWinners();
		
	}
}
