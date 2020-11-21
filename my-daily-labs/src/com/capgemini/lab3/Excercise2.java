package com.capgemini.lab3;

import java.util.Scanner;

public class Excercise2 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		StringBuffer r=getImage(s);
		System.out.println("Final string:"+s+"|"+r);
	}
	public static StringBuffer getImage(String s)
	{
		StringBuffer userInput=new StringBuffer(s).reverse();
		//System.out.println(s);
		//System.out.println(userInput.toString());
		return userInput;
	}}