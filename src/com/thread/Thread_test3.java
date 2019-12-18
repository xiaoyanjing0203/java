package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class MyThread3 implements Callable<Object>{


	@Override
	public Object call() throws Exception {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run（）方法正在运行");
		}
		return i;
	}
	
}
public class Thread_test3 {

	public static void main(String[] args) throws Exception, ExecutionException {
		// TODO 自动生成的方法存根
		MyThread3 mt1=new MyThread3();
		FutureTask<Object> ft1=new FutureTask<>(mt1);
		Thread t1=new Thread(ft1,"线程1");
		t1.start();
		MyThread3 mt2=new MyThread3();
		new Thread(new FutureTask<>(mt2),"线程2").start();
		new Thread(new FutureTask<>(new MyThread3()),"线程3").start();
		System.out.println("线程1的返回结果是"+ft1.get());
	}

}
