// write a program of factorial of a number from this formula
// formula: ncr=n!/r!(n-r)!
import java.util.*;
public class P70
{
	public static void main(String args[])
	{
		System.out.println("finding the factorial");
		Scanner sc=new Scanner(System.in);
		System.out.println("to fint ncr ");
		System.out.println("enter a 'n' number");
		int n=sc.nextInt();
		System.out.println("enter a 'r' number ");
		int r=sc.nextInt();
		int nfact=1;
		for (int i=1;i<=n;i++)
		{
			nfact *=i;     // nfact=nfact*i;
			
		}
		int rfact=1;
		for (int i=1;i<=r;i++)
		{
			rfact *=i;     // nfact=nfact*i;
		
		}
		int nmrfact=1;
		for (int i=1;i<=n-r;i++)
		{
			nmrfact *=i;     // nfact=nfact*i;
			
		}
		int ncr=nfact/(rfact*nmrfact);
		
		System.out.println("ncr ="+ncr);
		
	}
}