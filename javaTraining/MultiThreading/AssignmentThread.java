import java.io.*;
import java.lang.*;
import java.util.*;
class Ass extends Thread
{
	Stack<Integer> st=new Stack<>();
	int n,i=1;
	Scanner sc=new Scanner(System.in);
		
	public void run()
	{
		System.out.println("enter no of operations");
		n=sc.nextInt();
		for(;i<n;i++)
		{	//System.out.println(i);
		
			if(i%2==0)
			{
				System.out.println(st.peek()+" is deleted");
				st.pop();
				
			}
			else{
				
				st.push(i);
				System.out.println(i+" inserted in stack");
						
	        }
		}
	}
	
}
class AssignmentThread
{
	public static void main(String str[])
	{
		Ass obj=new Ass();
		obj.start();
	}
}