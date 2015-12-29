package com;

public class TestThreadProirity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tmax=new Thread(new MaxPriorityThread(),"优先级高的线程在运行：");
		
		//Thread tmin=new Thread(new MinPriorityThread(),"优先级低的线程在运行：");
		
		tmax.setPriority(Thread.MAX_PRIORITY);
		
		//tmin.setPriority(Thread.MIN_PRIORITY);
		
		
			
		//tmin.start();
		tmax.start();
		for(int i=1;i<5;i++){
			System.out.println(Thread.currentThread().getName()+i);
			if(i==2){
				try {
					tmax.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
		
		
	}

}
