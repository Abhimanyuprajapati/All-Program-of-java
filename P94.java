/*
    Write a program to enter the numbers till the user wants and at the end
    it should display the count of positive, negative and zeros entered.
*/ 

import java.util.*;
public class P94
{
	public static void main(String args[])
	{
		System.out.println("lazy person find the easy way of difficult problem");
		Scanner sc=new Scanner(System.in);
		int countpositive=0,countnegative=0,countzero=0;
		char choice;
		do{
			System.out.println("enter a no");
			int n=sc.nextInt();
			if(n>0)
			{
				countpositive++;
			}else if(n<0)
			{
				countnegative++;
			}else
			{
				countzero++;
			}
			System.out.print("Do you want to continue yes/no? ");
            choice = sc.next().charAt(0);
		}while(choice=='y' || choice == 'Y'); // this will check the condition if its true it will
 // execute otherwise exit the loop
        System.out.println("Positive numbers: " + countpositive);
        System.out.println("Negative numbers: " + countnegative);
        System.out.println("Zero numbers: " + countzero);
	}
}