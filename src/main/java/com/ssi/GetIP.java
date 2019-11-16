package com.ssi;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress address=InetAddress.getByName("www.facebook.com");
		System.out.println(address);
	}

}
