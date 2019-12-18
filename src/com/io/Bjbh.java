package com.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bjbh {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		Path wj=Paths.get("d:\\班级信息.txt");
		Path bjmc=Paths.get("d:\\求班级编号.txt");
		Path bjbh=Paths.get("d:\\班级编号.txt");
		List<String> neirong=new ArrayList<>();
		Files.createFile(bjbh);

		List<String> lines=Files.readAllLines(wj);
		List<String> names=Files.readAllLines(bjmc);
//		System.out.println("文件的内容是："+lines);
//		System.out.println("文件的大小为"+Files.size(wj)+"个字节");
		for (String name : names) {
			for (String line : lines) {
				String[] zfcsz=line.split("\t");
				if (name.equals(zfcsz[1])) {
					System.out.println(zfcsz[0]);
					neirong.add(zfcsz[0]);
				}
			}
			System.out.println(neirong.size());
			for (String bianhao : neirong) {
				System.out.println(bianhao);
			}
			Files.write(bjbh, neirong, StandardOpenOption.APPEND);
		}
		
	}

}
