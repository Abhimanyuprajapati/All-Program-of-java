// I need this output in java find the code for this 
/*
       1
	   12                  
	   121
	   1212
	   12121
*/	   
import java.util.Scanner;
public class P60
{
	public static void main(String args[])
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();     // number of rows in programs
	//outer loop
	    for(int i=1;i<=n;i++)
	    {
			//inner loop
	    	for(int j=1;j<=i;j++)
	    	{
		    	if(j%2==0)
				System.out.print("2 ");
			else
				System.out.print("1 ");
		    }
		    System.out.println();
	    }
	
	}
}