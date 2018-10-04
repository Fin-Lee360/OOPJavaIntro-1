/*
 * Fingal Lee
 * 16004718
 * Clock program
 * 01-10-2018
 */

package clock;

public class number {
	
	int limit;
	int value;
	
	number(int i)
	{
		limit = i;
		value = 0; 
	}
	
	/**
	 * setValue()
	 * This method is responsible for setting the value of the increment of time
	 */
	public void setValue(int nextValue)
	{
		if((nextValue < limit) && (nextValue >= 0))
		{
			value = nextValue; 
		}
	}
	
	/**
	 * getValue()
	 * This method returns the value of the increment of time
	 * @return value
	 */
	public int getValue()
	{
		return value; 
	}
	
	/**
	 * tick()
	 * This method increases the value by one
	 */
	public void tick()
	{
		value = (value + 1) % limit; 
	}
	
	/**
	 * getDisplay()
	 * This method sets the display of the clock
	 */
	public String getDisplay()
	{
		if(value < 10)
		{
			return "0" + value;
		}
		else
		{
			return "" + value; 
		}
	}
}
