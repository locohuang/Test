package com;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();	
		Thread t=new Thread(mt);
		t.start();
		while(true){
			System.out.println("main方法运行...");
		}
	}
}
