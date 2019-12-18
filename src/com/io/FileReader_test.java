package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_test {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("d://poem.txt");
		FileWriter fW=new FileWriter("poem1.txt");
		
		char[]buff=new char[1024];
		int b=fr.read(buff);
		while (b!=-1) {
			//System.out.print((char)b);
			fW.write(buff,0,b);
			b=fr.read(buff);
		}
		fr.close();
		fW.close();
	}

}
