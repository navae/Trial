package com.infy.firstProject.Array;

public class Not_Fixes_Array
{
	public static void main(String args[])
	{
	String [] s= {"Java","Testing","Selenium","Automation"};
	
	for(String w:s)
	{
		System.out.println(w);
	}
	
	System.out.println("==========Oject class====");
	
	Object [] o= new Object[3];
	o[0]="Aspire";
	o[1]=77;
	o[2]=543.9;
	
	for(Object w:o)
	{
		System.out.println(w);
	}
	
	System.out.println("==========For Loop====");
	
	for(int i=0; i<o.length;i++)
	{
		System.out.println(o[i]);
	}
	
  }
}
