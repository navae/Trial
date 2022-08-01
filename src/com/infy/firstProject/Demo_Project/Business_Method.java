package com.infy.firstProject.Demo_Project;

public class Business_Method 
{
	/*Business Method is second type of Method
	 * 
	 * there are two types of business methos
	 *    1.Static Methos
	 *    2.Non-static method*/
	
	//Static method:-
	/*syntax:- public static void MethodName() 
	            {
	          
	            }
	*/
	
	//Non-Static method
	/*syntax:-   public vois MethodName()
	               {
	 
	               }
	*/
	public static void main(String[] args)
	{
		demo();
		
		//What is Object?
		//It is an entity who has its own state and behaviour
		//In java object is an istance of class means it is an example of the class
		//object is blueprint of the class
		
		//syntax:-
		  //ClassName ObjectReferanceVariable=new ClassName();
		
		Business_Method obj=new Business_Method();
		obj.aspire();
	}
	
	
	//static method:-
	public static void demo()
	{
		System.out.println("This is static method");
	}
	
	//non-static method:-
	public void aspire()
	{
		System.out.println("This is NON-STATIC METHOD");
	}

}
