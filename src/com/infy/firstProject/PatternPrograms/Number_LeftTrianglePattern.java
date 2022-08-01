package com.infy.firstProject.PatternPrograms;

import java.util.Scanner;

public class Number_LeftTrianglePattern 
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		
		int row=sc.nextInt();
		
		System.out.println("====Pattern is====");
		
		
		for(int i=row;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

}
