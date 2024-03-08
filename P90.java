// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class P90
{
	public static void  display()   //pass by reference so we are using void 
	{                              // other wise return type will used
		System.out.println("enter a first no");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter a second no");
		int b=sc.nextInt();
		if (a<b)
		{
			System.out.println("greater="+b); // we can used 1 method or
		//	return b;   // second method
		}
		else
		{
			System.out.println("greater="+a);// we can used 1 method or
		//	return a; second method
		}
	}

	public static void main(String args[])
	{
		/* System.out.println("enter a first no");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter a second no");
		int b=sc.nextInt(); */
		display();    // call by reference
	}
}