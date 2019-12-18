package com.net.chat;

import java.net.DatagramSocket;
import java.net.SocketException;

import javax.xml.stream.events.StartDocument;

public class ChatRoom {

	public static void main(String[] args) throws Exception {
		// 创建套接字
		DatagramSocket ds=new DatagramSocket(8900);
		new Thread(new ChatReceiver(ds),"接收服务").start();
		new Thread(new ChatSender(ds,30000),"发送服务").start();
	}  

}
