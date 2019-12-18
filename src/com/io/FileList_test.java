package com.io;

import java.io.File;
import java.util.Arrays;

public class FileList_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File ml=new File("e:\\Java作业管理器");
		fileDir(ml);
	
	}

	private static void fileDir(File ml) {
		// TODO 自动生成的方法存根
		File[] wjsz=ml.listFiles();
		//foreach
		for (File file : wjsz) {
			if(file.isDirectory()) {
				fileDir(file);
			}else if(file.isFile()) {
				System.out.println(file);
			}
		}
	}
}
