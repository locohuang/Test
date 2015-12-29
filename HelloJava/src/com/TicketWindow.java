package com;
public class TicketWindow implements Runnable{	
	private int tickets=10;	
	public void run(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(this){
				if(tickets>0){				
					System.out.println(Thread.currentThread().getName()+ " 正在发售第"+tickets--+"张票");
				}
			}
		}
	}
	
	/*public void run(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			sale();
		}
	}
	public synchronized void sale(){
		if(tickets>0){
				System.out.println(Thread.currentThread().getName()+ " 正在发售第"+tickets--+"张票");
		}
	}*/
}
