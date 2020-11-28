package com.cg.lab9;

import java.util.Scanner;

public class Excercise2 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		Tester2 test=(newstr->str.replaceAll(""," "));
		System.out.println("String with spaces:"+test.withoutspaces(str));
	}
}