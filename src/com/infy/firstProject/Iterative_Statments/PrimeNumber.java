package com.infy.firstProject.Iterative_Statments;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check Prime or not");
		
		int num=sc.nextInt();
		
		//int num=17;
		boolean b=false;
		
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				b=true;
				
			}	
		}
		
		if(b!=true)
		
			System.out.println(num +"is a prime Number ");
		else
			System.out.println(num + "is not a prime number");
		
	}

}
