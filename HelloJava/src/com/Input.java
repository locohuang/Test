package com;

public class Input implements Runnable{
	private Storage st;
	private int num;
	public Input(Storage st) {
		// TODO Auto-generated constructor stub
		this.st=st;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			st.put(num++);
		}
	}
	

}
