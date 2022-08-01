package com.infy.firstProject.Iterative_Statments;

import java.util.Scanner;

public class AreaPerimeter_Circle 
{
	public static void main(String args [])
	{
		//double r= 7.5;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius");
		
		double r=sc.nextDouble();
		
		
		double area=Math.PI*r*r;
		System.out.println(area);
		
		
		double perimeter=2*Math.PI*r;
		System.out.println(perimeter);
		
	}

}
