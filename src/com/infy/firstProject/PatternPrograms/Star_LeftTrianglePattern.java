package com.infy.firstProject.PatternPrograms;

import java.util.Scanner;

public class Star_LeftTrianglePattern 
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		
		int row=sc.nextInt();
		
		System.out.println("====Pattern is====");
		
		for(int i=row; i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println(" ");
		}
	}

}
