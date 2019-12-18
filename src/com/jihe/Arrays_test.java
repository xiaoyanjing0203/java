package com.jihe;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_test {

	public static void main(String[] args) {
		int[]arr= {9,8,3,5,2};
		System.out.println("排序前：");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("\n排序后：");
		printArray(arr);
		
		int index=Arrays.binarySearch(arr, 9);
		System.out.println("\n元素9在排序后得数组中得索引是："+index);
		
		//拷贝数组元素
		int[] copiedArr=Arrays.copyOfRange(arr, 2, 8);
		System.out.println("\n被拷贝的数组是：");
		printArray(copiedArr);
		//替换数组元素
		Arrays.fill(copiedArr, 8);
		System.out.println("\n被拷贝的数组元素替换成8是：");
		printArray(copiedArr);
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i+"");
		}
		
	}

}
