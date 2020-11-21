package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise4 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered array is:"+Arrays.toString(arr));
		Arrays.sort(arr);
		//System.out.println("After sorting:"+Arrays.toString(arr));
		int[]modified=modifyArray(arr);
		System.out.print("Non duplicate array is:");
		for(int i=modified.length-1;i>=0;i--)
		{
			System.out.print(modified[i]+" ");
		}
		//System.out.println("Final array:"+Arrays.toString(b));
	}
	private static int[] modifyArray(int[]arr)
	{
		int size=arr.length;
		int[] b=new int[size];

		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if (arr[i]==arr[j])
				{
					arr[j]=arr[size-1];
					size--;
					j--;
					//System.out.println("b:"+b[k]);
				}
				//System.out.println("b:"+b[k]);
			}}
		b=Arrays.copyOf(arr, size);
		return b;
	}}