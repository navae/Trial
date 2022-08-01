package com.infy.firstProject.Iterative_Statments;

import java.util.Scanner;

public class ScannerClass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To check its Facorial");
		int number=sc.nextInt();
		
		/*System.out.println("Number is:" + number);
		*/
		
		int factorial=number;
		
		for(int i=(number-1); i>1; i--)
		{
			factorial=factorial*i;
		}
		
		
		System.out.println("Factoial of " + number + " is " + factorial);
		
		
	}

}
