package com;

public class TestTicketSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindow t=new TicketWindow();
		
		new Thread(t,"窗口1").start();
		new Thread(t,"窗口2").start();
		new Thread(t,"窗口3").start();
		new Thread(t,"窗口4").start();
		
	}

}
