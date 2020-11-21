package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise1 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want:");
		int n=sc.nextInt();
		System.out.println("Enter the elements in array:");
		int arr[]=new int[n];
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	
		}
		int secondSmallest=getSecondSmallest(arr);
		System.out.println("The second smallest integer is:"+secondSmallest);
	}
	/*for(i=0;i<arr.length;i++) {
System.out.print(arr[i]+ " ");
}*/
	private static int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		//int a=arr[1];
		return arr[1];

	}
}
