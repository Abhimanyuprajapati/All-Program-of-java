/* write a program of java to print this
       *******
	   ******
	   *****
	   ****
	   ***
	   **
	   * */
	   import java.util.*;
	   class P43
	   {
		   public static void main(String args[])
		   {
			   System.out.println("enter a no");
			   Scanner sc=new Scanner(System.in);
			   int a=sc.nextInt();
			   for(int i=a;i>0;i--)
			   {
				   for(int j=0;j<i;j++)
				   {
				   System.out.print("*");
				   }
				   System.out.print("\n");
			   }
		   }
	   }