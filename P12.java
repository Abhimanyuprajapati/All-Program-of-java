//write a program to calculate percentage of the student out of 5
import java.util.Scanner;
public class P12{
	public static void main(String args[])
	{
		System.out.println("enter your marks");
		Scanner sc=new Scanner(System.in);
		double sub1=sc.nextDouble();
		double sub2=sc.nextDouble();
		double sub3=sc.nextDouble();
		double sub4=sc.nextDouble();
		double sub5=sc.nextDouble();
		double sum=sub1+sub2+sub3+sub4+sub5;
		double per=sum/5;
		System.out.println("your total no are ="+sum);
		System.out.println("your percentage is ="+per);
	}
}