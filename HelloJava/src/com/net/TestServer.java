package com.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(3000);
		String str="hello world";
		DatagramPacket dp= new DatagramPacket(str.getBytes(), str.length(),
				InetAddress.getByName("localhost"),8957);
		System.out.println("发送消息...");
		ds.send(dp);
		ds.close();
	}

}
