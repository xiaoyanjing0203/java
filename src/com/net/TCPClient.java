package com.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		// 创建客户端套接字要带上服务器 的IP地址和端口
		Socket khdtjz=new Socket("10.2.103.31",8899);
		//通过客户端套接字获取写入网络的输入流
		OutputStream os=khdtjz.getOutputStream();
		//定义要上传的文件输入流
		FileInputStream fin=new FileInputStream("d:\\1.jpeg");
		//通过文件输入读取文件，并写入网络
		byte[]zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while (b!=-1) {
			//通过套接字获得的输出流写入网络
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		InputStream is=khdtjz.getInputStream();
		b=is.read(zjhc);
		while(b!=-1) {
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		is.close();
		khdtjz.close();
	}

}
