import java.io.*;
import java.util.*;
class Calculator1
{
	int n1,n2;
	Calculator1(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	void add()
	{
		System.out.println("Addition="+(n1+n2));
	}
	void multi()
	{
		System.out.println("Multiplication="+(n1*n2));
	}
	void sub()
	{
		System.out.println("Substraction="+(n1-n2));
	}
}

class Calculator extends Calculator1
{
	int n1,n2;
	Calculator(int n1,int n2)
	{
	
		super(n1,n2);
		this.n1=100;
		this.n2=10;
	}
	
    void div()
	{
		System.out.println("Division="+(n1/n2));
	}
}
	class UseCon extends Calculator
	{
	public static void main(String str[]) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1,n2;
		System.out.println("enter 1st No:");
		n1=Integer.parseInt(br.readLine());
		System.out.println("enter 2nd No:");
		n2=Integer.parseInt(br.readLine());
		
		Calculator cal=new Calculator(n1,n2);
		cal.add();
		cal.sub();
		cal.multi();
		cal.div();
		/*
		System.out.println("Addition="+cal.add(n1,n2));
		System.out.println("Substraction="+cal.sub(n1,n2));
		System.out.println("Multiplication="+cal.multi(n1,n2));
		System.out.println("Division="+cal.div(n1,n2));
	*/
	}
}

