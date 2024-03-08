// write a java program of reverse of a no. by using function
import java.util.*;
public class P72
{
	public static int reverse(int n)
	{
	  int rev=0;
	  while(n>0)
	  {
		  int rem=n%10;
		  rev=rev*10+rem;
		  n=n/10;
	  }
	  return rev;
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a no.to reverse");
		int a=sc.nextInt();
		int b=reverse(a);
		System.out.println("reverse of a no.="+b);
	}
}