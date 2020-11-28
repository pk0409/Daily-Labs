package com.cg.lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Excercise3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values in array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
		}
		Map<Integer, Integer> m=getSquares(arr);
		System.out.println(m.keySet()  +" : " +m.values());
	}
	private static Map<Integer,Integer> getSquares(int arr[]){
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], arr[i]*arr[i]);
		}
		return map;
	}
}
