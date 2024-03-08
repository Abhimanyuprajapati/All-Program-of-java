// write the program of the spiral array in 2D dimention
/*     11 21 31 41 51 61
       72 82 92 52 62 69   =  o/p     11 21 31 41 51 61 69 85 19 18 37 34 21 14 45 72 82 92 52 62 
       45 25 35 65 45 85   =           45 65 35 25
       14 21 34 37 18 19
	   this is called spial means circle loop
*/
	   
import java.util.*;
/*
public class P100
{
	public static int printspiral(int arr[][])
	{
		int minr=0,maxr=arr.length-1,minc=0,maxc=arr[0].length-1;
		int valuesLeftToPrint=arr.length*arr[0].length;
		while (valuesLeftToPrint>0)
		{
			// print top wall 
			for(int col=minc,col<=maxc;col++)
			{
				System.out.println([minr][col]);
				valuesLeftToPrint--;
			}
			minr++;
			
			// print rigth wall 
			for(int row=minr,row<=maxr;row++)
			{
				System.out.println([row][maxc]);
			}
			maxc--;
			
			// print bottom wall 
			for(int col=maxc,col>=minc;col--)
			{
				System.out.println([maxr][col]);
			}
			maxr--;
			
			// print left wall 
			for(int col=maxr,col>=minr;row--)
			{
				System.out.println([row][minc]);
			}
			minc++;
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("work hard abhi");
		int arr[][]={
			{1,2,35},
		    {11,56,30},
		    {15,25,38},
		    {19,28,5};
			}
		printspiral(arr);
	}
}

*/
public class P100{
        public static void printSpiral(int arr[][])
		{
		int minr = 0, maxr = arr.length - 1, minc = 0, maxc = arr[0].length -1;
	
		int valuesLeftToPrint = arr.length * arr[0].length;
		
		while(valuesLeftToPrint > 0)
			{
			
			// print top wall
			for(int col = minc; col <= maxc; col++) {
				System.out.println(arr[minr][col]);
				valuesLeftToPrint--;
			}
			minr++;
			
			// print right wall
			for(int row = minr; row <= maxr; row++) {
				System.out.println(arr[row][maxc]);
				valuesLeftToPrint--;
			}
			maxc--;
			
			// print bottom wall
			for(int col = maxc; col >= minc; col--) {
				System.out.println(arr[maxr][col]);
				valuesLeftToPrint--;
			}
			maxr--;
			
			// print left wall
			for(int row = maxr; row >= minr; row--) {
				System.out.println(arr[row][minc]);
				valuesLeftToPrint--;
			}
			minc++;
		}
	}

	public static void main(String[] args)
	{
		int arr[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}
				};

		printSpiral(arr);
	}
}

