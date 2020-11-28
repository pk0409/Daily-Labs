package com.cg.lab8;

public class TimerRunnableDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		//Runnable object
		Runnable runnable= new TimerRunnable();

		Thread t1= new Thread(runnable,"The timer");
		//main thread spawns thread, "The timer" which executes run() method
		//start() method invokes run() method
		t1.start();


	}

}