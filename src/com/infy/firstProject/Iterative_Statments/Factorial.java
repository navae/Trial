package com.infy.firstProject.Iterative_Statments;

public class Factorial 
{
	
	public static void main(String args[])
	{
		int number=4;
		int factorial=number;
		
		for(int i=(number-1); i>1; i--)
		{			
			factorial=factorial*i;	
		}
		
		System.out.println("factoial of "+ number + " is " + factorial);
	}

}
