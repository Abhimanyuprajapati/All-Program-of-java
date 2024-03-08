// write a java code for GCD opitimised code
import java.util.*;
public class P102
{
	public static int display(int a,int b)
	{
		int dividend=a,divisor=b;
		while(dividend%divisor>0)
		{
			int rem=dividend%divisor;
			dividend=divisor;
			divisor=rem;
		}
		return divisor;
	}
	public static void main(String args[])
	{
		System.out.println("rejected");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(display(a,b));
		
	}
}