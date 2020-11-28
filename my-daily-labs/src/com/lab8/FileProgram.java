package com.cg.lab8;

public class FileProgram {
	public static void main(String args[])
	{
		//System.out.println(Thread.currentThread());
		Thread t=new CopyDataThread("run");
		t.start();
	}
}
