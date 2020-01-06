package com.book.cyc2018.javabingfa.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description �������̰߳�˳��ѭ����ӡabc������ĸ������abcabcabc
 * @CreateDate 18/08/07 17:25
 * @Author zohn
 * @Version 1.0
 */
public class AbcThread implements Runnable {
    private ReentrantLock reentrantLock = new ReentrantLock();
    private Condition condition = reentrantLock.newCondition();
    private int state = 0;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        reentrantLock.lock();
        // �����ٽ���
        try {
            for (int i = 0; i < 10; i++) {
                if (name.equals("B")) {
                    // ֻ��a��a2ͬʱΪtrueʱ�Ŵ�ӡB������������ǰ�߳�
                    while (state % 3 != 1) {
                        condition.await();// ���������㣬��ʱ�����̣߳���ʱ�ͷ�lock
                    }
                } else if (name.equals("C")) {
                    while (state % 3 != 2) {
                        condition.await();
                    }
                } else if (name.equals("A")) {
                    while (state % 3 != 0) {
                        condition.await();
                    }
                }
                state++;
                System.out.print(name);
                condition.signalAll();// ֪ͨ���ڵȴ����̣߳���ʱ�п����Ѿ���������
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();// �ǵ�Ҫ�ͷ���
        }
    }

    public static void main(String[] args) {
        AbcThread task = new AbcThread();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        thread1.setName("A");
        thread2.setName("B");
        thread3.setName("C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
