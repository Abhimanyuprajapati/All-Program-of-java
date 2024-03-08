// Write a function that takes in the radius as input and returns the circumference of a circle.
// formula c=2piR 
import java.util.*;
public class P91
{
	public static void display(double r) // call by value
	{
   	    final double pi=3.14;    // final is the key that makes the constant 
		double c=(2*(pi*r));
		System.out.println("circumference of a circle="+c);
		// return c;
	}
	public static void main(String args[])
	{
		
	    System.out.println("enter a radius");
    	Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		display(r); //passing the value
	}
}