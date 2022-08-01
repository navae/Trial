package com.infy.firstProject.Operator;

public class Arithmetic_operator 
{
	static double a=10;
	static double b=20;
	
	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Arithmetic Operators");
		System.out.println("Addition is"+ (a+b));
		System.out.println("Substraction is"+ (a-b));
		System.out.println("Multiplication is"+ (a*b));
		System.out.println("Division is"+ (a/b));
		System.out.println("Remainder is"+ (a%b));
		
		System.out.println("Left shift="+(10 << 2)); //10 * 2^2
		System.out.println("Right shift="+(10 >> 2)); //10/2^2
		System.out.println("Double Right Shift="+(10>>>2));
	}

}
