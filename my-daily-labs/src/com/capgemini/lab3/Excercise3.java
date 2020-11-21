package com.capgemini.lab3;

import java.util.Scanner;

public class Excercise3 {
public static void main(String args[])
{
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String s=sc.nextLine();
System.out.println("String is:"+s);
System.out.println(("Final String:"+alterString(s.toCharArray())));
}
private static String alterString(char[] s)
{
	for(int i=0;i<s.length;i++)
	{
		if (s[i]!='a' && s[i]!='e' && s[i]!='i' && s[i]!='o' && s[i]!='u' )
		{
			s[i] = (char) (s[i] + 1); 
		}
		/*else if(s[i]== 'z')
		{
			s[i]='b';
		}*/
		else
		{
			s[i] = (char) (s[i]);
		}
	}
	return String.valueOf(s);
	}
}
