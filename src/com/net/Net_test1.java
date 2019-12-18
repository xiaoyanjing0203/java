package com.net;

import java.net.InetAddress;

public class Net_test1 {

	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println("本机的IP地址是：" + ip.getHostAddress());
		InetAddress ip2 = InetAddress.getByName("www.hbjhart.com");
		System.out.println("江汉艺术职业学院web服务器的IP地址是：" + ip2.getCanonicalHostName());
		if (ip2.isReachable(3000)) {
			System.out.println("从本机到江汉艺术职业学院web服务器3秒到达");
		} else {
			System.out.println("从本机到江汉艺术职业学院web服务器3秒不可到达");
		}
		System.out.println("江汉艺术职业学院web服务器的名字是：" + ip2.getHostName());
	}

}
