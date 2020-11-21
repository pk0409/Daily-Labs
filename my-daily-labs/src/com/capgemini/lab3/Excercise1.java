package com.capgemini.lab3;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Excercise1 {
	public static void main(String args[])
	{
		int sum=0,n=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer string(with spaces):");
		String userInput=sc.nextLine();
		StringTokenizer st=new StringTokenizer(userInput);
		System.out.print("Entered string is:");
		while(st.hasMoreTokens())
		{
			n=Integer.parseInt(st.nextToken());
			System.out.print(n+" ");
			sum+=n;
		}
		System.out.println();
		System.out.println("Sum:"+sum);
	}
}
