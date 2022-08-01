
public class Run_time_test extends Run_time_poly
{
	public void addition(int a)
	{
		System.out.println("I am non static method from sub class");
		
	}
	
	
	public static void sub(char a)
	{
		System.out.println("i am static method from sub class");
	}
	
	
	public static void main(String args[])
	{
		Run_time_test t=new Run_time_test();
		t.addition(2);
		
		sub('a');
		
		
	}

}
