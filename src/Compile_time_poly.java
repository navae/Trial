
public class Compile_time_poly 
{
	public static void main(String args[])
	{
		Compile_time_poly p=new Compile_time_poly(1);
		p.addition();
		p.addition('a', 0);
		//p.addition(0);
		
		addition(2);
		
		
	}
	
	
	Compile_time_poly(int a)
	{
		
	}
	
	public void addition()
	{
		System.out.println("I am non static with no argument method");
	}
	
	public static void addition(int a)
	{
		System.out.println("I am static method with one argument");
	}
	
	public void addition(char b, int a)
	{
		System.out.println("Iam non static method with 2 arguments");
	}

}
