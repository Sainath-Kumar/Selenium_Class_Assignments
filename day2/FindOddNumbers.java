package week1.day2;

import java.util.Iterator;

public class FindOddNumbers {

	public static void main(String[] args)
	{
		int maxRange = 10;
				for (int i = 0; i<= maxRange; i++)
				{
				if (i%2 != 0) 
				{
					System.out.println("Odd Number : "+i);
				}
				}
	}

}
