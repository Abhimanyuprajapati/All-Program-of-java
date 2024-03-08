//write a program to find the area of the circle(A=pir square)
import java.util.*;
public class P24
{
	public static void main(String args[])
	{
		System.out.println("you can do it abhi");
		System.out.println("to find area of a circle ")
		Scanner as=new Scanner(System.in);
		final double pi=3.14;
		System.out.println("enter the radius");
		double r=as.nextDouble();
		double A=pi*r*r;
		System.out.println("Area of a circle ="+A);
	}
}