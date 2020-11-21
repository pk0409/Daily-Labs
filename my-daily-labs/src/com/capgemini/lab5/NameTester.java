package com.capgemini.lab5;
import java.util.Scanner;
public class NameTester {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your First name:");
			String firstName=sc.nextLine();
			System.out.println("Enter your Last Name:");
			String lastName=sc.nextLine();
			if (firstName.isEmpty() || lastName.isEmpty())
			{
				throw new NameException("First or last name cannot be blank");
			}
			else {
				System.out.println(firstName+ " "+lastName+".."+"The name entered is valid");
			}}
		catch(NameException e)
		{
			e.printStackTrace();
		}
	}
}
