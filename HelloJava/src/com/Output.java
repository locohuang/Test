package com;

public class Output implements Runnable{
	private Storage st;
	public Output(Storage st) {
		// TODO Auto-generated constructor stub
		this.st=st;
		System.out.println("");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			st.get();
		}
	}
	
}
