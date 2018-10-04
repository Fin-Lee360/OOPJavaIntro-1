/*
 * Fingal Lee
 * 16004718
 * Clock program
 * 01-10-2018
 */

package clock;

import java.util.concurrent.TimeUnit;

public class display {
	
	private number hour;
	private number min;
	private number sec; 
	// add seconds
	
	private String display; 
	//constructor
	display(int hours, int mins, int secs)
	{
		hour = new number(24);
		min = new number(60);
		sec = new number(60);
		setTime(hours,mins,secs);
	}
	
	/**
	 * setTime()
	 * This method sets the value of all the number objects
	 */
	public void setTime(int hours, int mins, int secs)
	{
		hour.setValue(hours);
		min.setValue(mins);
		sec.setValue(secs);
		updateDisplay(); 
	}
	
	/**
	 * updateDisplay()
	 * This method grabs the current value from each increment of time and 
	 * formats it into the display string and then prints it
	 */
	public void updateDisplay()
	{
		display = hour.getDisplay() + ":" + min.getDisplay() + ":" + sec.getDisplay();
		System.out.println(display); 
	}
	
	/**
	 * tickingTime()
	 * guides the program to tick accordingly
	 * @throws InterruptedException 
	 */
	public void tickingTime() throws InterruptedException
	{
		for(int x = 0; x < 3600; x++)
		{
			sec.tick();
			
			if(sec.getValue() == 0)
			{
				min.tick();
				if(min.getValue() == 0)
				{
					hour.tick(); 
				}
			}
			updateDisplay();
			TimeUnit.SECONDS.sleep(1);
		}
	}
}
