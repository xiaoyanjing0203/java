package com.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// 创建服务器套接字
		ServerSocket fwqtjz=new ServerSocket(8899);
		//在死循环不断监听
		while(true) {
			//获取客户端套接字
			Socket khdtjz=fwqtjz.accept();
			new Thread(()->{
				try {
				//通过客户端套接字获取客户端的ip地址
				String ip=khdtjz.getInetAddress().getHostAddress();
				//通过客户端套接字获取客户端的端口号
				int port=khdtjz.getPort();
				System.out.println("和客户端ip地址是："+ip+",端口是"+port+"连接上了");
	
				InputStream is;
				
					is = khdtjz.getInputStream();
				
				byte[]zjhc=new byte[1024];
				FileOutputStream fout=new FileOutputStream("d:\\upload"+ip+".jpeg");
				int b=is.read(zjhc);
				while(b!=-1) {
					fout.write(zjhc,0,b);
					b=is.read();
				}
				
				String xinxi="上传成功";
				OutputStream os=khdtjz.getOutputStream();
				os.write(xinxi.getBytes("UTF-8"));
				os.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}).start();
			
		}
		
	}

}
