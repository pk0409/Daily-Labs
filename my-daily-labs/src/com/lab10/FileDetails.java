package com.cg.lab10;

import java.io.File;

public class FileDetails {

	public static void print(String str)
	{
		System.out.println(str);
	}
	public static void analyze(String s)
	{
		File f=new File(s);
		if(f.exists())
		{
			print(f.getName()+" is a file");
			print(f.canRead()?" is readable":" is not readable");
			print(f.canWrite()?" is writable":" is not writable");
			print("Filesize:"+f.length()+" bytes");
			print("File last modified:"+f.lastModified());
			System.out.println("File exist.");
		}
		/*if(f.isDirectory())
		{
			print(f.getName()+" is directory");
			print("List of files");
			String dir[]=f.list();
			for(int i=0;i<dir.length;i++)
				print(dir[i]);
		}*/
		else {
			System.out.println("File does not exist.");
		}
	}
}
