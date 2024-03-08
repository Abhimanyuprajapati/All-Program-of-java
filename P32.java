// write a program of fibonaccia series 
import java.util.*;
class P32
{
	public static void main(String args[])
	{
		System.out.println("enter a no.");
	int n,a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
			
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}