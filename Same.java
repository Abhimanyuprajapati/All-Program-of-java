//write a program of swipping of a two no by using temp variable
import java.util.Scanner;
public class Same
{
	public static void main(String args[])
	{
		System.out.println("work hard");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.printf("a=%2f\nb=%2f\n",a,b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+"     "+"b="+b);
	}
}
