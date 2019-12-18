package com.jihe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParalleStream_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String> list=Arrays.asList("张三","里斯","张笑死","张晓明");
		Stream<String> ps=list.parallelStream();
		if(ps.isParallel()) {
			System.out.println("只是一个并行流");
		}
		ps.limit(3).forEach(ys->System.out.println(ys));
	}

}
