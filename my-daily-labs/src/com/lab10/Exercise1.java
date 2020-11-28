package com.cg.lab10;

import java.io.FileInputStream;
import java.io.IOException;

public class Exercise1
{
	public static void main(String args[])throws IOException
	{
		int cnt=1;
		char ch;
		@SuppressWarnings("resource")
		FileInputStream fr=new FileInputStream("C:\\Users\\DELL1\\eclipse-workspace\\my-daily-labs\\src\\com\\cg\\lab8\\source.txt");
		System.out.println("\nContents of the file are");
		int n=fr.available();
		System.out.print(cnt+": ");
		for(int i=0;i<n;i++)
		{
			ch=(char)fr.read();
			System.out.print(ch);
			if(ch=='\n')
			{
				System.out.print(++cnt+": ");

			}

		}
	}
}
