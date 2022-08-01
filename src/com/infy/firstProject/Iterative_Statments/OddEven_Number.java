package com.infy.firstProject.Iterative_Statments;

import java.util.Scanner;

public class OddEven_Number 
{
	public static void main(String argd [])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number to check" );
		
		int number=sc.nextInt();
		
		if(number%2==0)
			System.out.println(number + "is even number");
		else
			System.out.println(number + "is odd number");
	}

}
