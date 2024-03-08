// write a java code for prime no to print all till user wants 
// 2,3,.....no
import java.util.*;
public class P104            // try this first wrong hai ye 
{
	public static boolean prime(int a)
	{
		for (int i=2;i<=a;i++)
		{
			if (a%i==0)
				return false;
		}
		return true;
	}
	public static void prime1(int n)
	{
		for (int i=2;i<=n;i++)
		{
			System.out.println(prime(i));
		}

	}
	public static void main(String args[])
	{
		System.out.println("please work hard in theory");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		prime1(a);
	}
}