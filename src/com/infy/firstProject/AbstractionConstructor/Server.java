package com.infy.firstProject.AbstractionConstructor;

public abstract class Server 
{
	String name;
	
	public Server(String name)
	{
		this.name=name;
	}
	
	
	public abstract boolean start();

}
