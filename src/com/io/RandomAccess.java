package com.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自动生成的方法存根
		RandomAccessFile raf=new RandomAccessFile("time.txt", "rw");
		int time=Integer.parseInt(raf.readLine())-1;
		if (time>0) {
			System.out.println("你还可以尝试"+time+"次");
			//回到文件开始位置
			raf.seek(0);
			raf.write((time+"").getBytes());
		}else {
			System.out.println("次数已经用玩");
		}
		raf.close();
	}

}
