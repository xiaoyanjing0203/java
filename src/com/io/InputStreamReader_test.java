package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReader_test {

	public static void main(String[] args) throws IOException {
		// 定义标准字节输入流
		//InputStream jpsr=System.in;
		//将标准字节输入流转换成字符流
		//InputStreamReader ir=new InputStreamReader(jpsr);
		//将字符流包装成缓冲字符流
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("profile.txt")));
		
		System.out.println("请输入兵兵的年龄：");
		String line=br.readLine();
		bw.write("您叫"+line);
		br.close();
		bw.flush();
		bw.close();
	}

}
