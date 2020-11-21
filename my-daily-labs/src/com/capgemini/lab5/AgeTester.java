package com.capgemini.lab5;
import java.util.Scanner;
public class AgeTester {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			System.out.println("Enter your age: ");
			int age= scanner.nextInt();
			if(age<18) {
				throw new AgeException("You are under-aged, cannot vote");
			}
			System.out.println("You are eligible to vote");

		}catch(AgeException e) {
			e.printStackTrace();
		}

	}

}