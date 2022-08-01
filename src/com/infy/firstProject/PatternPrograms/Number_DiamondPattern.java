package com.infy.firstProject.PatternPrograms;

import java.util.Scanner;

public class Number_DiamondPattern 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of rows");
		
		int rows=sc.nextInt();
		
		System.out.println("----Pattern is-----");
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
          System.out.println(" ");  
		}
		
		//for lowe half
		
		
		for(int i=rows-1;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println(" ");
			
		}
		
	}

}
