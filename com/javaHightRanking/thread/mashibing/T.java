package com.javaHightRanking.thread.mashibing;

/**
 * @author Administrator
 */
public class T {
    private int count = 10;
    private Object o = new Object();

    public void m() {
        // �κ��߳�Ҫ��ִ������Ĵ��룬�������õ�o����
        synchronized(o) {
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }
}
