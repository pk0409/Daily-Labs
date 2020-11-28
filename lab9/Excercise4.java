package com.cg.lab9;
public class Excercise4 {
	public static void user()
	{
		System.out.println("Hello,my name is Priyanka..");
	}
	public static void main(String args[])
	{
		Tester4 test=Excercise4::user;
		test.details();
	}}