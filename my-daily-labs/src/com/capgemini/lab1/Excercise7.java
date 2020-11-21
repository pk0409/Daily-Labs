package com.capgemini.lab1;
import java.lang.String;
import java.util.Scanner;

public class Excercise7 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(checkNumber(n)==true)
		{
			System.out.println("The number entered is increasing number");
		}
		else 
		{
			System.out.println("The number entered is not an increasing number");
		}
	}
	private static boolean checkNumber(int n) {
		String s=String.valueOf(n);
		int length=s.length();
		for(int i=0;i<length-1;i++)
		{
			if (s.charAt(i)<=s.charAt(i+1))
			{
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
