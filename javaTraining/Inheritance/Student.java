/*  Single level inheritance  */
import java.io.*;
class College
{
	void displayCollege(int clgId,String cname)
	{
	System.out.println("\nCollege Id:"+clgId);
	System.out.println("College name:"+cname);

	}

}
class Student extends College
{
	
	void displayStudent(int rno,String sname)
	{
		System.out.println("\nStudent roll no:"+rno);
	    System.out.println("Student name:"+sname);

		
	}
	
public static void main(String str[])
{
	System.out.println("\nExample os Single level Inheritance");
Student s=new Student();
	s.displayCollege(04,"D Y Patil");
	s.displayStudent(15,"John");
}
} 