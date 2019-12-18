package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TickWindow5 implements Runnable{
	private int tickets=10;
	//定义锁
	Lock lock=new ReentrantLock();
	
	public void run() {
		while (true) {
			//加锁
			lock.lock();
			if (tickets>0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					//线程买完后解锁
					lock.unlock();
				}
			}
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在发售"+tickets--+"张票");
			}else {break;}
		}
	}
}
public class Thread_test13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TickWindow5 tw=new TickWindow5();
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();
	}

}

