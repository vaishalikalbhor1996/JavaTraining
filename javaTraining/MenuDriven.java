  
  import java.io.*;
  import java.util.*;
  
  class Menu1{
	  void display(int rno)
	  {
		System.out.println("Roll no:"+rno);  
	  }
  }
  
  
  
  public class MenuDriven extends Menu1
  {
	void display(int rno)
	{
		System.out.println("Roll no:"+rno);
	}
	
	void display(int rno,String name)
	{
		System.out.println("\n\tRoll no:"+rno);
		System.out.println("\n\tName:"+name);
	}
	
	void display(int rno,String name,int marks)
	{
		System.out.println("\n\t\tRoll no:"+rno);
		System.out.println("\n\t\tName:"+name);
		System.out.println("\n\t\tMarks:"+marks);
	}
	
	
	public static void main(String str[])
	{
		int ch;
	//	do{
		System.out.println("1.Function overloading");
		System.out.println("2.Function overrinding");
		System.out.println("Enter your choice:");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
		 case 1:
				MenuDriven m=new MenuDriven();
				m.display(10);
				m.display(10,"john");
				m.display(10,"john",90);
				break;
		 case 2:
		       MenuDriven m1=new MenuDriven();
				m1.display(11);
				Menu1 m2=new Menu1();
				m2.display(20);
				break;
			
		//MenuDriven p=new MenuDriven();
		
		}
		//}while(1);
	}
  
  }