package com.infy.firstProject.Operator;


public class Logical_Bitwise_operator 
{
	static int a=100;
	static int b=200;
	static int c=300;
	
	public static void main(String[] args)
	{
		System.out.println("-----Logical && Operator-----");
		System.out.println("F+F=F----->"+(a>b && c>b));	
		System.out.println("F+T=F----->"+(a>b && b<c));
		System.out.println("T+F=F------>"+(a>b && c<b));
		System.out.println("T+T=T----->"+(a<b && b<c));
		
		System.out.println("-----Bitwise & Operator-----");
		System.out.println("F+F=F----->"+(a>b & c>b));	
		System.out.println("F+T=F----->"+(a>b & b<c));
		System.out.println("T+F=F------>"+(a>b & c<b));
		System.out.println("T+T=T----->"+(a<b & b<c));
		
		
		System.out.println("-----Logical || Operator-----");
		System.out.println("F+F=F----->"+(a>b || c<b));	
		System.out.println("F+T=T----->"+(a>b || b<c));
		System.out.println("T+F=T------>"+(a<b || c<b));
		System.out.println("T+T=T----->"+(a<b || b<c));
		
		System.out.println("-----Bitwise| Operator-----");
		System.out.println("F+F=F----->"+(a>b | c<b));	
		System.out.println("F+T=T----->"+(a>b | b<c));
		System.out.println("T+F=T------>"+(a<b | c<b));
		System.out.println("T+T=T----->"+(a<b | b<c));
		
		
	}

}
