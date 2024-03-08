/*
 Two numbers are entered by the user, x and n. Write a function to find the value of
 one number raised to the power of another i.e. xn.
 */
 import java.util.*;
public class P95 
{
 
    // Function to calculate N raised to the power P
    static int power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);   //
    }
 
    // Driver code
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
        int N =sc.nextInt();
		System.out.println("enter the power you wants");
        int P =sc.nextInt();
 
        System.out.println(power(N, P));
    }
}