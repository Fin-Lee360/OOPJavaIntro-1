package guessinggame;

public class GuessGame 
{
	Player p1;
	Player p2;
	Player p3;

	public void startGame()
	{
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int)(Math.random()*10);
		System.out.println("I'm thinking of a number between 1 and 9.");
		
		while(true)
		{
			// System.out.println("The number I am thinking of is " + targetNumber);
			
			System.out.println("Player one, guess now.");
			p1.guess();
			System.out.println("Player two, guess now.");
			p2.guess();
			System.out.println("Player three, guess now.");
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1 + ".");
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2 + ".");
			
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3 + ".");
			
			if(guessp1 == targetNumber)
			{
				p1isRight = true;
			}
			
			if(guessp2 == targetNumber)
			{
				p2isRight = true;
			}
			
			if(guessp3 == targetNumber)
			{
				p3isRight = true;
			}
			
			if(p1isRight||p2isRight||p3isRight)
			{
				System.out.println("-----------------");
				System.out.println("We have a winner!");
				System.out.println("-----------------");
				System.out.println("Player 1 got it right? " +p1isRight);
				System.out.println("Player 2 got it right? " +p2isRight);
				System.out.println("Player 3 got it right? " +p3isRight);
				System.out.println("Game is over.");
				break; // game is finished so end loop
			}
			
			else
			{
				System.out.println("No one got it right. Try again!");
			} // end if/else
		} // end of while loop	
	} // end of method
} // end of class