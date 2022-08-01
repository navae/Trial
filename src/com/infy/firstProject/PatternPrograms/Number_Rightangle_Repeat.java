package com.infy.firstProject.PatternPrograms;

import java.util.Scanner;

public class Number_Rightangle_Repeat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows ");
		
		int rows=sc.nextInt();
		
		System.out.println("----Pattern is-----");
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
		
	}

}
