 // write a program to find the smallest of arry in a no
import java.util.*;
public class P40
{
	public static void main(String args[])
	{
	int a[]={20,30,40,50,60,10,70,80};
	 int min=a[0];
	 for(int i=0;i<a.length;i++)
	 {
		 if(min>a[i])
		 {
			 min=a[i];
		 }
		// System.out.println("maximum no is ="+min);
	 }
	 System.out.println("maximum no is ="+min);
	}		
}