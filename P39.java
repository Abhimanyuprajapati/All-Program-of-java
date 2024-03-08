// write a program to find the largest of arry in a no
import java.util.*;
public class P39
{
	public static void main(String args[])
	{
	int a[]={10,20,30,40,50,60,70,80};
	 int max=a[0];
	 for(int i=0;i<a.length;i++)
	 {
		 if(max<a[i])
		 {
			 max=a[i];
		 }
		System.out.println("maximum no is ="+max);
	 }
	 System.out.println("maximum no is ="+max);
	}		
	

}

