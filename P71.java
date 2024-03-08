// write a program of a factorial of a no. by using function method

import java.util.*;
public class P71
{
	public static int factorial(int n)
	{
		int nfact=1;
		for (int i=1;i<=n;i++)
		{
			nfact=nfact*i;
		}
		return nfact;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a 'n' number ");
		int n=sc.nextInt();
		System.out.println("enter a 'r' number ");
		int r=sc.nextInt();
		int nfact=factorial(n);
		int rfact=factorial(r);
		int nmrfact=factorial(n-r);
		int ncr=nfact/(rfact*nmrfact);
		System.out.println("ncr= "+ncr);
		
	}
}