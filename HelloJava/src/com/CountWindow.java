package com;
public class CountWindow {	
	private int count = 10;
	private boolean flag=true;	
	public boolean isFlag() {return flag;}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public synchronized void print(){		
		try {			
			Thread.sleep(2000);
			if(Thread.currentThread().getName().equals("窗口1")){
				this.notify();
				if(count>0){
					System.out.println(Thread.currentThread().getName()+":"+(count--));
				}
				this.wait();
			}else if(Thread.currentThread().getName().equals("窗口2")){
				this.notify();
				if(count>0){
					System.out.println(Thread.currentThread().getName()+":"+(count--));
				}
				this.wait();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
