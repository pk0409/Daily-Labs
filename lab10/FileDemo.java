package com.cg.lab10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileDemo {

	  @SuppressWarnings("static-access")
	public static void main(String rr[])throws IOException
      {
            FileDetails fd=new FileDetails();
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter the file name:");
             String s=br.readLine();
             fd.analyze(s);
      }
}
