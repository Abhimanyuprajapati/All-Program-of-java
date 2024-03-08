//finding CGPA
import java.util.Scanner;
public class P15{
	public static void main(String args[])
	{
		System.out.println("enter your SCGP");
		Scanner sc=new Scanner(System.in);
		double sem1=sc.nextDouble();
		double sem2=sc.nextDouble();
		double sem3=sc.nextDouble();
		double sem4=sc.nextDouble();
		double sem5=sc.nextDouble();
		double sem6=sc.nextDouble();
		double sum=sem1+sem2+sem3+sem4+sem5+sem6;
		double CGPA=sum/6;
		System.out.println("your total no are ="+sum);
		System.out.println("your CGPA is ="+CGPA);
	}
}