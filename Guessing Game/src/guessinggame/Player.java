package guessinggame;
import java.util.Scanner;
public class Player 
{
	static Scanner kboard = new Scanner (System.in);
	int number = 0;
	
	public void guess()
	{
		number = kboard.nextInt();	
	}
}
