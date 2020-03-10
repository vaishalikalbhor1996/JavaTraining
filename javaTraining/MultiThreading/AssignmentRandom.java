import java.io.*;
import java.lang.*;
import java.util.*;
class RandomClass extends Thread
{
	int n,i=0;
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	public void run()
	{
		System.out.println("enter no of Random numbers you want?");
		n=sc.nextInt();
		
		int arr[]=new int[10];
		for(;i<n;i++)
			//System.out.println(i);
			arr[i]=rand.nextInt();
		
		for(i=0;i<n;i++)
		{
				
			if(arr[i]>=0)
			{
				
			if(arr[i]%2==0)
				System.out.println(arr[i]+" is Positive Even");
			else
				System.out.println(arr[i]+" is positive odd");
			}else
				System.out.println(arr[i]+" is negative number");
		}
    }
	
}
class AssignmentRandom   
{
	public static void main(String str[])
	{
		RandomClass obj=new RandomClass();
		obj.start();
	}
}