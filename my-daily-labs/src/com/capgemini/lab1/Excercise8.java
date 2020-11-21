package com.capgemini.lab1;
import java.util.Scanner;
public class Excercise8 {

	public static void main(String args[])
	{
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(checkNumber(n)==true)
		{
			System.out.println("The given number"+" "+n+" "+"is power of 2");
		}
		else
		{
			System.out.println("The given number"+" "+n+" "+"is not power of 2");
		}
	}
	private static boolean checkNumber(int n)
	{
		if(n<=0)
		{
			return false;	
		}
		while(n>1)
		{
			if(n%2!=0)
			{
				return false;
			}
			n=n/2;
		}
		return true;
	}
}