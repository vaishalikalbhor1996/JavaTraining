import java.io.*;
class MultiTread extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
MultiTread t1=new MultiTread();  
t1.start();  
 }  
}  