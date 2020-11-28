package com.cg.lab9;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class Excercise3 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your username:");
		String name=sc.nextLine();
		System.out.println("Enter your password:");
		String pswd=sc.nextLine();
		/*Tester3 test=(username,password)->
			{
		if(username.equals("root")&& password.equals("root_12"))
{
	return true;
}
return false;
};
System.out.println(test.userDetails(name, pswd));*/
		BiPredicate<String,String> bipredicate=(username,password)->
		{
			if(username.equals("root")&& password.equals("root_12"))
			{
				return true;
			}
			return false;
		};
		System.out.println(bipredicate.test(name, pswd));
	}
}
