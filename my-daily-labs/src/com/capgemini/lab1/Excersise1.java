package com.capgemini.lab1;

import java.util.Scanner;

public class Excersise1 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=calculateCubeOfDig(n);
		System.out.println(sum);
	}
	static int calculateCubeOfDig(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int n1=n%10;
			int temp= n1*n1*n1;
			sum+=temp;
			n=n/10;
		}
		return sum;
	}}
