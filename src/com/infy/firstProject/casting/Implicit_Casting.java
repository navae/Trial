package com.infy.firstProject.casting;

public class Implicit_Casting 
{
	//1.Implicit Casting/Widening Casting
	
	//implicit casting short datatypes are cnverted into bigger datatypes
	//byte(1b)--->short(2b)---->int(4b)-----.long(8b)
	//flaot(4b)---->double(8b)
	
	
	public void Implicit() //No data loss and we get correct value
	{
	int a=30;
	long b=a;
	
    byte c=10;
    short s=c;

	System.out.println(b);
	System.out.println(s);
	}
	
	
	//2.Explicit Casting/Narrowing Casting
	
	//In explicit casting bigger datatypes are converted into smaller datatyes
	//byte(1b) <------short(2b) <------int(4b) <----long(8b)
	//float(4b) <------double(8b)
	
	public void Explicit() //data loss and we dont get correct values in return
	
	{
		int a=123;
		byte b=(byte)a;
		
		System.out.println(b);
	}
	
	
	 
	
	public static void main(String args[])
	{
		Implicit_Casting i=new Implicit_Casting();
		i.Implicit();
		System.out.println("--------Explict-------");
		i.Explicit();
	}

}
