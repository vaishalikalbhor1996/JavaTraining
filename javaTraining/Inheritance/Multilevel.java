/*  Multilevel inheritance  */
import java.io.*;
class College
{
	void displayCollege(int clgId,String cname)
	{
		System.out.println("\n Display function of first class");
	
	System.out.println("College Id:"+clgId);
	System.out.println("College name:"+cname);

	}

}
class Student extends College
{
	
	void displayStudent(int rno,String sname)
	{
		super.
		System.out.println("\n Display function of second class");
	
		System.out.println("Student roll no:"+rno);
	    System.out.println("Student name:"+sname);
    
	}
}
class Multilevel extends Student
{
	void display()
	{
		super.displayStudent(15,"John");
		System.out.println("\n Display function of third class");
	 }
public static void main(String str[])
{
	System.out.println("\nExample of Multilevel Inheritance");
    Multilevel s=new Multilevel();
    s.display();
	//s.displayCollege(04,"D Y Patil");
	//s.displayStudent(15,"John");
}
} 