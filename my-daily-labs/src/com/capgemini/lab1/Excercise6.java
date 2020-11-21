package com.capgemini.lab1;

import java.util.Scanner;

public class Excercise6 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=calculateDifference(n);
		System.out.println(sum);
	}
	private static int calculateDifference(int n){
		int sum=0;
		int sumOfSquares =0;
		int squareOfSum=0;
		int total=0;
		for(int i=0;i<=n;i++)
		{ 
			sumOfSquares += i*i;

		}
		System.out.println(sumOfSquares);
		for(int j=0;j<=n;j++)
		{
			total +=j;	
		}
		squareOfSum += total*total;
		System.out.println(squareOfSum);
		sum +=sumOfSquares-squareOfSum;

		return sum;
	}
}