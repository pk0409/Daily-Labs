package com.capgemini.lab1;

import java.util.Scanner;

public class Excersise2 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the choice of light:");
		String light=sc.nextLine();
		switch(light)
		{
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default:System.out.println("Invalid choice");
		}
		sc.close();
	}}
