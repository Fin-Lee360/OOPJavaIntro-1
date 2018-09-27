/*
 * Sol Campbell 27/09/2018
 * Version 2.1 of pontoon
 */
package pontoonV2;

public class Dealer 
{
	private int dealerCard1;		// declarations
	private int dealerCard2;
	static int dealerTotal;			//static so can be used throughout
	
	public void dealer() // constructor
	{
		this.getDealerCard();
	}
	
	public void getDealerCard() // finds the dealers original hand
	{
		dealerCard1 = (int)(Math.random()*10)+1;
		dealerCard2 = (int)(Math.random()*10)+1;
		dealerTotal = dealerCard1 + dealerCard2;
	}
	
	public void getDealerTotal() // 'draws' a new card for the dealer
	{
		int dealernewCard = (int)(Math.random()*10)+1;
		dealerTotal = dealerTotal + dealernewCard;
	}
	
	
	public static int getDealerFinal() // allows dealers total to be accessed in other classes
	{
		return dealerTotal;
	}
}
