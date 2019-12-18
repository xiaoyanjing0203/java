package com.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_test {

	public static void main(String[] args) {
		// Paths:工具类Path:路径接口
		Path path=Paths.get("E:\\旋转图片\\img\\6.png");
		System.out.println("这个路径的根路径是："+path.getRoot());
		System.out.println("这个路径的父路径是："+path.getParent());
		System.out.println("这个路径的路径名称数是："+path.getNameCount());
		for (int i = 0; i <+path.getNameCount(); i++) {
			System.out.println("索引为"+i+"的路径名称是"+path.getName(i));
		}
		System.out.println("这个路径的URI路径是"+path.toUri());
		System.out.println("这个路径的绝对路径是"+path.toAbsolutePath());
	}

}
