package com.infy.firstProject.PatternPrograms;

import java.util.Scanner;

public class Number_RightDown 
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		
		int row=sc.nextInt();
		
		System.out.println("====Pattern is====");
		
		
		for(int i=row;i<=1;i--)
		{
			for(int j=1;j<=1;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}
	}

}
