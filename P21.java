//write the following expression in a java program
//     v2-u2/2a*5
import java.util.Scanner;
public class P21
{
	public static void main(String args[])
	{
		System.out.println("keep going abhimanyu");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of v square");
		double v=sc.nextDouble();
		System.out.println("enter the value of u");
	    double u=sc.nextDouble();
		System.out.println("enter the value of a");
		double a=sc.nextDouble();
		double f=(v*v)-(u*u)/2*a*5;
		System.out.println("formula="+f);
		
	}
}
