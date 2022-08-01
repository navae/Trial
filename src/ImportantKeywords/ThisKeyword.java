package ImportantKeywords;

public class ThisKeyword
{
	String Name;
	int MobileNo;
	int b=50;
	
	ThisKeyword(String Name , int MobileNo)
	{
		this.Name=Name;
		this.MobileNo=MobileNo;
		System.out.println(Name);
		System.out.println(MobileNo);
		
		
	}
	
	public void demo()
	{
		System.out.println(Name);
		System.out.println(MobileNo);
		
	}
	
	public static void main(String args[])
	{
		ThisKeyword t=new ThisKeyword("Aniket", 12335456);
		t.demo();
		
		
	}
	
	

}
