package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		// 创建套接字
		DatagramSocket ds=new DatagramSocket(8900);
		//定义一个缓冲数组，用于接收数据
		byte[] buf=new byte[1024];
		//定义一个数据报对象，用于封装接收数据
		DatagramPacket dp=new DatagramPacket(buf, buf.length);
		System.out.println("等待接收数据...");
		//再死循环里不断接收数据
		while (true) {
			ds.receive(dp);
			//构造获得的二进制数据，转换成String
			String xinxi=new String(dp.getData(),0,dp.getLength());
			//将获得信息展示在控制台中
			System.out.println(dp.getAddress().getHostAddress()+":"+xinxi);
		}
	}

}
