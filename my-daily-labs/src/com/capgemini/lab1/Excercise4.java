package com.capgemini.lab1;

import java.util.Scanner;

public class Excercise4 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Prime numbers till"+" "+n+" "+"are:");
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+ " ");
			}}}
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
