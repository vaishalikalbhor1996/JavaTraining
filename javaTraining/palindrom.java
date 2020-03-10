  
  import java.io.*;
  public class Palindrom
  {
	void check(int n)
	{
		int i,t,sum=0;
		t=n;
	while(n>0)
	{
		i=n%10;
		sum=sum*10+i;;
		n=n/10;
		System.out.println(sum);
	}
	if(t==sum)
	
	
			System.out.println("Given number is palindrom ");
		else
			System.out.println("Given number is not palindrom");
	}
	public static void main(String str[])
	{
		
		
		Palindrom p=new Palindrom();
		p.check(151);
	}
  
  }