package com.Thread;

public class ThreadDemoApplication {
	public static void main(String[] args) {
	   Thread main;
	   MyRunnable r=new MyRunnable();	
	   Thread t=new Thread(r);
	   t.start();
	   Thread t2=new Thread(r);
	   t.yield();
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
			main = Thread.currentThread();
		}
	}

}
