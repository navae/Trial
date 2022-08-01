package com.infy.firstProject.PatternPrograms;

import java.util.Scanner;

public class Star_DiamondPattern
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		
		int rows=sc.nextInt();
		
		System.out.println("====Pattern is====");
		
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*" +" ");
			}
			System.out.println(" ");
		}
		
		//other half
		
		
		for(int i=rows-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
			
			System.out.println(" ");
			
		}
	}

}
