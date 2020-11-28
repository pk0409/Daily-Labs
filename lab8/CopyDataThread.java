package com.cg.lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {
	public CopyDataThread()
	{

	}
	public CopyDataThread(String tname)
	{
		super(tname);
	}
	public void run()
	{
		//System.out.println(Thread.currentThread());	
		try {
			FileReader fr=new FileReader("C:\\Users\\DELL1\\eclipse-workspace\\my-daily-labs\\src\\com\\cg\\lab8\\source.txt");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter("C:\\Users\\DELL1\\eclipse-workspace\\my-daily-labs\\src\\com\\cg\\lab8\\target.txt");
			int i;

			while((i=fr.read())!=-1)
			{

				if(i%10==0)
				{
					System.out.println("10 characters are copied");
					try {
						Thread.sleep(5000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				fw.write(i);	
			}
			br.close();
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
	}}