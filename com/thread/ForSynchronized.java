package com.thread;

/**
 * 
 * <p>Title:synchronized �����Ϳ������</p>
 * <p>Description:</p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company:bksx</p>
 * <p>CreateDate:2018��5��14��</p>
 * @author zohn
 * @version 1.0
 */
public class ForSynchronized {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		//for (int i = 0; i < 3; i++) {
			// new Thread(new MyThread()).start(); // ����ÿ�ζ�������һ���߳�
			// new Thread(new MyThread()).start();
			// new Thread(new MyThread()).start();
			// new Thread(new MyThread()).start();
			new Thread(myThread).start(); // ���:0-9
			new Thread(myThread).start();// ����һ�� ���:�������޹��ɵ�,ÿ�����н����һ����
		//}
	}
}

class MyThread extends Thread {
	
	public synchronized void run() { // ����synchronized֮��,����0-9,new Thread(Obj)���ٴ�,���м���0-9
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
		}
	}
	
}
