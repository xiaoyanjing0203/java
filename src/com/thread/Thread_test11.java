package com.thread;

class TickWindow3 implements Runnable{
	private int tickets=10;
	//定义对象作为同步锁
	Object lock=new Object();
	
	public void run() {
		while (true) {
			//同步代码块
			synchronized (lock) {
			if (tickets>0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在发售"+tickets--+"张票");
			}else {break;}
		}
	}
}
public class Thread_test11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TickWindow3 tw=new TickWindow3();
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();
	}

}

