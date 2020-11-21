package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scanner.nextInt();
		scanner.nextLine();
		String str[]=new String[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			str[i]=scanner.nextLine();
		}
		String str1[]=sortStrings(str);
		for(int i=0;i<n;i++) {
			System.out.print(str1[i]);
		}
	}
	private static String[] sortStrings(String[] str) {
		Arrays.sort(str);
		int mid=0;
		if(str.length % 2 != 0) {
			mid=str.length/2 +1;
		}
		else {
			mid=str.length/2;
		}
		for(int i=0;i<mid;i++) {
			str[i]=str[i].toUpperCase();
		}
		for(int i=mid;i<str.length;i++) {
			str[i]=str[i].toLowerCase();
		}
		return str;
	}
}