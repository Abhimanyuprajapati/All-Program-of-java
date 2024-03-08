// 5 6 7 1 2 3
import java.util.*;
public class P
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=0;
		int min=0;
		for (int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int j=0; j<n; j++)
		{
			if (arr[j]>max)
			{
				max=arr[j];
			}
			if (arr[j]<min)
			{
				min=arr[j];
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
}