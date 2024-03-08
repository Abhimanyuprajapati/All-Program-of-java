//write a program of five no. to find the average of that
import java.util.Scanner;
public class P13{
	public static void main(String args[])
	{
		System.out.println("enter a no please :");
		Scanner sc=new Scanner(System.in);
		double a1=sc.nextDouble();
		double a2=sc.nextDouble();
		double a3=sc.nextDouble();
		double avg=(a1+a2+a3)/3;
		System.out.println("Average is = "+avg);
	}
}