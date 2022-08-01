package com.infy.firstProject.Encapsulation;

public class Use 
{
	private String principal; //----.Instance variable
	
	private int mobileNo;
	
	
	public void set(int mobileNo)
	{
		this.mobileNo=mobileNo;
	}
	
	public int getmobileNo()
	{
		return mobileNo;
		
	}
	
	public void set(String principal)//---->local variable and to connect local variables to insatance variables we us this keyword
	{
		this.principal=principal;		
	}
	
	public String getprincipal()
			{
				return principal;
		
			}
	
	public static void main(String args[])
	{
		Use u=new Use();
		
		
		u.set("Akash");
		String p=u.getprincipal();
		System.out.println(p);
		
		
		u.set(14324345);
		int b=u.getmobileNo();
		System.out.println(b);
	}

}
