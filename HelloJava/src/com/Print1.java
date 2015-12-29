package com;

public class Print1 implements Runnable{
	
	private CountWindow cw;	
	public Print1(CountWindow cw) {
		// TODO Auto-generated constructor stub
		this.cw=cw;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			cw.print();
		}
	}

}
