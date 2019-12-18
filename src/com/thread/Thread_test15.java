package com.thread;

import java.util.concurrent.*;

//1.定义一个实现Callable接口 的实现类
class MyThread6 implements Callable<Object> {
	// 1.1重写Callable接口的call()方法
	@Override
	public Object call() throws Exception {
		int i = 0;
		while (i++ < 5) {
			System.out.println(Thread.currentThread().getName() + "的call()方法在运行");
		}
		return i;
	}

}

public class Thread_test15 {

	public static void main(String[] args) throws Exception, ExecutionException {
		// 2.创建Callable接口实现类的对象
		MyThread6 mt6 = new MyThread6();
		// 3.使用Excutors线程执行器创建可扩展的线程池
		ExecutorService pool = Executors.newCachedThreadPool();
		// 4.将Callable接口实现类的对象提交到线程池进行管理
		Future<Object> result1 = pool.submit(mt6);
		Future<Object> result2 = pool.submit(mt6);
		// 5.关闭线程池
		pool.shutdown();
		// 6.对于有返回值的线程值，获取执行结果
		System.out.println("thread-1返回结果" + result1.get());
		System.out.println("thread-2返回结果" + result2.get());
	}

}
