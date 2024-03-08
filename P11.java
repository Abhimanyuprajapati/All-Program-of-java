//write a program of addition of two no.by using scanner
import java.util.Scanner;
public class P11{
	public static void main(String args[])
	{
		System.out.println("enter the no.");
		//double a=sc.nextDouble();
		Scanner sc=new Scanner(System.in);
				boolean b1=sc.hasNextDouble();
				boolean b2=sc.hasNextDouble();
	//	System.out.println(b1);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println(b1);
		System.out.println(b2);
        double c=a+b;
		double c1=a-b;
		double c2=a*b;
		double c3=a/b;
		double c4=a%b;
        System.out.println("the sum are ="+c);	
        System.out.println("the sum are ="+c1);
        System.out.println("the sum are ="+c2);
        System.out.println("the sum are ="+c3);
        System.out.println("the sum are ="+c4);
 
	}
}	