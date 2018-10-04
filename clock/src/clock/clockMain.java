/*
 * Fingal Lee
 * 16004718
 * Clock program
 * 01-10-2018
 */

package clock;

import java.util.Scanner;

public class clockMain {
	
	private static Scanner kb;

	public static void main(String[] args)throws InterruptedException
	{
		kb = new Scanner(System.in);
		
		String[] increments = {"Hour","Minuet","Seconds"};
		int[] times = new int [3];
		
		for(int x = 0; x < increments.length; x++)
		{
			System.out.println("Please enter the " + increments[x]);
			times[x] = kb.nextInt(); 
		}
		
		display clockDisplay = new display(times[0],times[1],times[2]);
		clockDisplay.tickingTime(); 
	}

}
