package com;

public class MaxPriorityThread implements Runnable{

	public void run(){
		for(int i=1;i<=5;i++){
			
			System.out.println(Thread.currentThread().getName()+i);
			
			/*try {				
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
