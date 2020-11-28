package com.cg.lab8;

import java.time.LocalDateTime;

public class TimerRunnable implements Runnable{

	@Override
	public void run() {

		for(int i=0;i<100;i++) {
			try {
				Thread.sleep(10000);
				System.out.println(Thread.currentThread().getName()+" starts at :"+LocalDateTime.now());
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}




	}

}