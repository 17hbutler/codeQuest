package codeQuestTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Try {

	public static void main(String[] args) throws IOException
	{
		Scanner file = new Scanner(new File( "Prob09.in.txt")); 
		while(file.hasNextDouble()) 
			{
			double num = file.nextDouble(); 
			System.out.println(all(num));
			}
	}
	
	public static String cent(double r) 
		{
		int num = (int)((r % 1) * 100);
		String and = "and "; 
		if(num == 1)
			{
			and = and + (num + " Cent");
			}
		else
			{
			and = and + (num + " Cents");
			}
		return and; 
		}
	
	public static String dollars(int t) 
		{
		String[] theOnes = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
		String[] theTeens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fiveteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};
		String[] theTens = {"Zero", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Hundred"};
		String str = ""; 
		if(t / 100 != 0)
			{
			str += (theOnes[(t / 100)] + " Hundred ");
			}
		if((t % 100) / 10 == 1)
			{
			str += (theTeens[((t % 100) - 10)] + " ");
			return str;
			}
		else if((t % 100) / 10 != 0)
			{
			str += (theTens[((t % 100)/ 10)] + " ");
			}
		if((t % 10) != 0)
			{
			str += (theOnes[(t % 10)] + " ");
			}
		return str;
		}
	public static String all(double k)
		{
		String hp = "";
		if(k >= 1)
			{
			if(k > 1000)
				{
				hp += (dollars((int)((double)(k / 1000)))) + "Thousand ";
				}
		hp = hp + dollars((int)(k % 1000));
			}
		else
			{
			hp += "Zero ";
			}
		hp = hp + "Dollars ";
		hp = hp + cent((k % 1));
		return hp;
		}

}
