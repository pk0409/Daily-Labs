package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise3 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the array:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] last=getSorted(arr);
		{
			System.out.println("Array is :"+ Arrays.toString(last));	
		}
	}
	private static int[] getSorted(int arr[])
	{
		int rev[]=new int[arr.length];
		int j=arr.length;
		//String str=Arrays.toString(arr);
		//System.out.println(str);
		for(int i=0;i<arr.length;i++)
		{
			rev[j-1]=arr[i];
			j=j-1;
		}
		System.out.println(Arrays.toString(rev));
		//char reverse[]= rev.toCharArray();
		Arrays.sort(rev);
		return rev;

	}
}