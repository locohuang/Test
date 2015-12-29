package com;

public class TestSwicth {

	public static void main(String[] args){
		CountWindow cw=new CountWindow();		
		new Thread(new Print1(cw),"窗口1").start();
		new Thread(new Print2(cw),"窗口2").start();
	}
}
