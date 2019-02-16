package com.cyc2018.javabingfa.huchitongbu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description ReentrantLock
 * @CreateDate 18/07/26 11:12
 * @Author zohn
 * @Version 1.0
 */
public class LockExample {
    private Lock lock = new ReentrantLock();

    public void func() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        } finally {
            lock.unlock();// ȷ���ͷ��� ��������
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->lockExample.func());
        executorService.execute(()->lockExample.func());
    }
    // ReentrantLock��java.util.concurrent(J.U.C)���е����������synchronized���˼����߼�����
    // 1.�ȴ����ж� ���������̳߳��ڲ��ͷ�����ʱ�� ���ڵȴ����߳̿���ѡ������ȴ� ȥ������������
    // 2.ʵ�ֹ�ƽ�� ��ƽ���Ƕ���߳��ڵȴ�ͬһ������ʱ�� ���밴�������˳�������λ���� synchronized�е����Ƿǹ�ƽ�� ReentrantLock
    // �е���Ĭ��Ҳ�Ƿǹ�ƽ�� ���ǿ���ͨ�����в���ֵ�ù��캯��Ҫ��ʹ�ù�ƽ��
    // 3.���󶨶������
}
