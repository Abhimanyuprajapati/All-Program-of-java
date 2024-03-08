// write a java code for LCM finding of two no
// write the half code for gcd
import java.util.*;
public class P103
{
	public static int gcd(int a,int b)
	{
		 int dividend=a,divisor=b;   
		 while(dividend%divisor>0)     
		 {
			 int rem = dividend%divisor;
			 dividend = divisor;
			 divisor = rem;
		 }
		 return divisor;
	}
	public static int lcm(int a,int b)
	{
		int gcd1=gcd(a,b);
		return (a*b)/gcd1;
	}
	public static void main(String args[])
	{
		System.out.println("ypu a rejected");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("answer="+lcm(a,b));
	}
}