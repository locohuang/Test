package com;

public class MyThread implements Runnable{

	public void run(){
		while(true){
			System.out.println("run方法在运行");
		}
	}
}
