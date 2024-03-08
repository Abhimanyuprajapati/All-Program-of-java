/* Write a program to print Fibonacci series of n terms where n is input by user :
    0 1 1 2 3 5 8 13 21 .....      */
//
import java.util.*;
public class P98
{
	public static int display(int n)
	{
	    int a=0,b=1;
		int c;
		System.out.println(+a+"\n"+b);
        for(int i=2;i<=n;i++)
		{
		  c=a+b;
          System.out.println(c);	
          a=b;
          b=c;		  
		}
        return 0;		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int n=sc.nextInt();
		display(n);
	}
}