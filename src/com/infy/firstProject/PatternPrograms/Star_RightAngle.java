package com.infy.firstProject.PatternPrograms;

import java.util.Scanner;

public class Star_RightAngle
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of rows");
		
		int row=sc.nextInt();
		
		System.out.println("====Pattern is:");
		
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}
	}

}
