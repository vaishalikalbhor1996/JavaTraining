/*  Hybrid inheritance  */
import java.io.*;
class College
{
	void displayCollege(int clgId,String cname)
	{
		System.out.println("\n Display function of Base class");
	
	System.out.println("College Id:"+clgId);
	System.out.println("College name:"+cname);

	}

}
class Student extends College
{
	
	void displayStudent(int rno,String sname)
	{
		super.displayCollege(04,"D Y Patil");
		System.out.println("\n Display function of second level  class");
	
		System.out.println("Student roll no:"+rno);
	    System.out.println("Student name:"+sname);
    
	}
}
interface Library extends College
{
	//System.out.println("interface call");
}
class HybridInher extends Student implements Library{


public static void main(String str[])
{
	System.out.println("\nExample of Hybrid Inheritance");
    HybridInher s=new HybridInher();
  
	s.displayStudent(15,"John");
	//s.displayCollege(04,"D Y Patil");
	//s.displayStudent(15,"John");
}
} 