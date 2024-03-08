// write a java code for addition of two no.
// by using function
import java.util.*;
public class P66
{
	public static int additionfunction(int a,int b)
	{
	int sum=a+b;
	return sum;     //we should always return the value what we want to return
		
	}
	public static void main(String args[])
	{
		System.out.println("addition function");
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number 1");
		int a=sc.nextInt();           // taking the input from user
		 System.out.println("enter a number 2");
        int b=sc.nextInt();          // taking the input from user
		int sum;
		sum=additionfunction(a,b);        // calling the function
		System.out.println("addition="+sum);
	}
}