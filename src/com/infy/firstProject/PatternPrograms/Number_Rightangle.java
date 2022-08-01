package com.infy.firstProject.PatternPrograms;

import java.util.Scanner;

public class Number_Rightangle 
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of ROWS:");
		
		int rows=sc.nextInt();
				
		System.out.println("Patterrn is");
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
				
			}
	System.out.println(" ");
		}
	}

}

