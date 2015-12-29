package com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIP {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress localAddress=InetAddress.getLocalHost();
		System.out.println(localAddress.getHostAddress());
		InetAddress remoteAddress=InetAddress.getByName("www.gdylc.cn");
		System.out.println(remoteAddress.getHostAddress());
	}

}
