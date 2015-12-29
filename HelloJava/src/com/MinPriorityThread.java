package com;

public class MinPriorityThread implements Runnable{
	
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+i);
			/*if(i==3){
				System.out.println("线程让步：");
				Thread.yield();
			}*/			
			
			
			
			
		}
	}

}
