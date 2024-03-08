// write a java code for finding the common factor of a two number
// by using function
/*
       a=50        b=60
	   common factor is    1,2,5,10.
*/
import java.util.*;
public class P97
{
	public static void display(int m,int n)
	{
		//int a,b;
		for(int i=1;i<=m;i++)
		{
			if (m%i==0&&n%i==0)
			{
				System.out.println(i);
			//	return i;
			}
		}
		//return 1;

	}
	public static void main(String args[])
	{
		
		System.out.println("enter a first no");
		//System.out.println("enter a no");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter a second no");
		int b=sc.nextInt();
		//System.out.println("common factor is=" + display(a,b)); 
		display(a,b);
	}
}	   
	   