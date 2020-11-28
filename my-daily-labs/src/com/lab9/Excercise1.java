package com.cg.lab9;

import java.util.Scanner;

public class Excercise1 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x:");
		double x=sc.nextDouble();
		System.out.println("Enter value of y:");
		double y=sc.nextDouble();
		Tester1 test=(num1,num2)->(Math.pow(x, y));
		System.out.println(test.raise(x, y));
	}
}
