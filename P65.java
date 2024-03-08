// write a java code by using function and return type is integer
import java.util.*;
public class P65
{
	public static int value(int a,int b)    //creating the function
	{
		System.out.println("the number is ="+a);
		System.out.println("the number="+b);
		return 0;        // simply return the value
	}
	
	public static void main(String args[])
	{
		System.out.println("enter your number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();           // taking the input from user
        int b=sc.nextInt();          // taking the input from user
		value(a,b);        // calling the function
		
	}
} 