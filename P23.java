//write a program of swipping of a two no by using temp variable
import java.util.Scanner;
public class P23
{
	public static void main(String args[])
	{
		System.out.println("work hard");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double temp;
		System.out.printf("a=%2f\nb=%2f\n",a,b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+"     "+"b="+b);
	}
}
