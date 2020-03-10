import java.io.*;
import java.util.*;
class Calculator1
{
	int add(int a,int b)
	{
		return a+b;
	}
	int multi(int a,int b)
	{
		return a*b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
}

class Calculator extends Calculator1
{
	int div(int a,int b)
	{
		return a/b;
	}
	public static void main(String str[]) throws IOException
	{
		Calculator cal=new Calculator();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1,n2;
		System.out.println("enter 1st No:");
		n1=Integer.parseInt(br.readLine());
		System.out.println("enter 2nd No:");
		n2=Integer.parseInt(br.readLine());
		System.out.println("Addition="+cal.add(n1,n2));
		System.out.println("Substraction="+cal.sub(n1,n2));
		System.out.println("Multiplication="+cal.multi(n1,n2));
		System.out.println("Division="+cal.div(n1,n2));
	}
}

