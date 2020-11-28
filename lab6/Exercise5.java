package com.cg.lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		Integer arr[]=new Integer[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int num=getSecondSmallest(arr);

		System.out.println("Second smallest element in array is:"+num);
	}
	private static int getSecondSmallest(Integer []arr)
	{
		List<Integer>list=Arrays.asList(arr);
		Collections.sort(list);
		System.out.println(list);
		return arr[1];
	}
}
