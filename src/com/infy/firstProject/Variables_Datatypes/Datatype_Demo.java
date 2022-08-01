package com.infy.firstProject.Variables_Datatypes;

public class Datatype_Demo 
{
       //Datatypes represents the TYPE of infromation
	   //Datatypes are mandatory.
	
	public static void main(String[] args)
	{
		Datatype_Demo  dd=new Datatype_Demo();
		dd.Boolean_Demo();
		dd.Byte_Demo();
		dd.Short_Demo();
		dd.Int_Demo();
		dd.Long_Demo();
		dd.Float_Demo();
		dd.Double_Demo();
		dd.char_Demo();
	}
	
	
	
	//Types od Datatypes:
	
	public void Boolean_Demo()
	{
		//Defalut value=False
		//Default size=1 bit
		
		boolean b=true;
		System.out.println("Boolean Value is "+b);
	}
	
	public void Byte_Demo()
	{
		//Defalut value=0
		//Defalut size=1 byte
		//Range=-127 to128
		
		byte b=127;
		System.out.println("Byte value is "+b);
	}
	
	public void Short_Demo()
	{
		//Defalut value=0
		//Defalut Size=2 byte
		//Range=-32767 to32787
		
		short b=32767;
		System.out .println("Short Value is "+b);
	}
	
	public void Int_Demo()
	{
		//Default value=0
		//Defalut Size=4 Byte
		//Range=(-2^31)to((2^31)-1)
		
		int b=1234567899;
		System.out.println("Int value is "+b);
	}
	
	public void Long_Demo()
	{
		//Defalut value=0
		//Defalut size=8 Byte
		//Range=(-2^63)to((2^63)-1)
		
		long b=123999999999999999l;
		System.out.println("Long Value is "+b);
		
	}
	
	public void Float_Demo()
	{
		//Default value=0.0
		//Defalut Size=4 byte
		//Range=Unlimited
		
		float b=11676765765.99999999f;
		System.out.println("Float Value is "+b);
	}
	
	public void Double_Demo()
	{
		//Defalut value=0.0
		//Defalut size=8 Byte
		//Range=Unlimited
		
		double b=12123234435.98887675d;
		System.out.println("Double value is "+b);
	}
	
	public void char_Demo()
	{
		//Default value=
		//Defalut size=
		//Range=
		
		char b='a';
		System.out.println("Char value is "+b);
	}
}
