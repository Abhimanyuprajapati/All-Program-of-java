//write a program to convert kilometer to miles
import java.util.*;
public class P16{
	public static void main(String args[])
	{
		System.out.println("enter your kilometer");
		Scanner sc=new Scanner(System.in);
		double k1=sc.nextDouble();
		double miles=k1*0.62137;
		System.out.println("miles are ="+miles);
	}
}