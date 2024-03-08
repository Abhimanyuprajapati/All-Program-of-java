/* write a java program of arrays to find the sum of a number
by using function call  */   // system inputs
import java.util.*;
public class P74
{
	public static int arr()
	{
		int arr1[]={45,25,56,02,11};
		int sum=0;
		for (int i=0;i<arr1.length;i++)
		{
			sum=sum+arr1[i];
		}
		return sum;
	}
	public static void main(String args[])
	{
		System.out.println("see the arrays sum");
		System.out.println("sum="+arr());
	}
}