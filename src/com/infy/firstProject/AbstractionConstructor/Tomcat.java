package com.infy.firstProject.AbstractionConstructor;

public class Tomcat extends Server
{

	public Tomcat(String name) 
	{
		super(name);
		
	}

	@Override
	public boolean start() 
	{
		
		System.out.println(this.name + "Sever started succesffully");
		return false;
	}
	

}
