package com.cg.lab9;

import java.util.Scanner;

public class Excercise5 {

	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		Tester5 test=(x)->{
			int fact=1;
			for(int i=1;i<=n;i++)
				fact=i*fact;
			return fact;
		};
		System.out.println("Factorial:"+test.fact(n));
	}}
