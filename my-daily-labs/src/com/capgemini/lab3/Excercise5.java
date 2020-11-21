package com.capgemini.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise5 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String userInput=sc.nextLine();
		System.out.println("The string entered is:"+userInput);
		int userCount=userInput.replace(" ","").length();
		System.out.println("Number of characters:"+userCount);
		String[]words=userInput.split(" ");
		Arrays.toString(words);
		int wordCount=words.length;
		System.out.println("Number of words:"+wordCount);
		String[]lines=userInput.split("[!?.:]+");
		Arrays.toString(lines);
		int lineCount=lines.length;
		System.out.println("Number of lines:"+lineCount);
	}
}
