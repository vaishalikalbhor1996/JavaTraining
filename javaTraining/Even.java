  
  import java.io.*;
  public class Even
  {
	void check(int n)
	{
		if(n%2==0)
		
			System.out.println("Given number is even ");
		else
			System.out.println("Given number is odd");
	}
	public static void main(String str[])
	{
		//Scanner  sc=new Scanner(System.in);
		
		Even e=new Even();
		e.check(21);
	}
  
  }