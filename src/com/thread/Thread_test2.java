package com.thread;
class MyThread1 extends Thread{

	public MyThread1(String name) {
		super();
		// TODO 自动生成的构造函数存根
	}
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run（）方法正在运行");
		}

	}
}
public class Thread_test2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyThread1 thread1=new MyThread1("thread1");
		thread1.start();
		MyThread1 thread2=new MyThread1("thread2");
		thread2.start();
	}

}
