package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[]buf=new byte[1024];
		DatagramSocket ds=new DatagramSocket(8957);
		
		DatagramPacket dp=new DatagramPacket(buf, 1024);
		System.out.println("等待接受数据...");
		
		ds.receive(dp);
		String string=new String(dp.getData(),0,dp.getLength())+"from "+
				dp.getAddress().getHostAddress()+":"+dp.getPort();
		System.out.println(string);
		ds.close();
	}

}
