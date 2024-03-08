// write a java program of 1D array from user
import java.util.*;

public class P110
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {	
             arr[i]=sc.nextInt();
        }
        System.out.println("after the scan");
        for(int j=0;j<n;j++)
        {
            System.out.println(arr[j]);
        }
	}
}