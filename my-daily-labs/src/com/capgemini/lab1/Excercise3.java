package com.capgemini.lab1;

import java.util.Scanner;

public class Excercise3 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int count=sc.nextInt();
		int first=1;
		int second=1;
		int next,i;
		System.out.print(first+" "+second);
		for (i=2;i<count;i++)
		{
			next=first+second;
			System.out.print(" "+next);
			first=second;
			second=next;
		}	
		sc.close();
	}
}