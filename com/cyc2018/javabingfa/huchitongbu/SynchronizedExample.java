package com.cyc2018.javabingfa.huchitongbu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description synchronized ͬ��һ������
 * @CreateDate 18/07/23 17:50
 * @Author zohn
 * @Version 1.0
 */
public class SynchronizedExample {
    public void func1() {
        synchronized (this) { // synchronizedֻ������ͬһ������ ����������������ϵ�ͬ������� �������ͬ��
            for (int i = 0; i < 100; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void func2(){
        synchronized (SynchronizedExample.class){ // ������������ Ҳ����˵�����̵߳���ͬһ����Ĳ�ͬ���������ͬ�����
            // Ҳ�����ͬ��
            for (int i = 0; i < 20; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        /**
         * ͬ��һ������
         */
//        SynchronizedExample synchronizedExample = new SynchronizedExample();
//        SynchronizedExample synchronizedExample2 = new SynchronizedExample();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(() -> synchronizedExample.func1()); //
//        executorService.execute(() -> synchronizedExample.func1()); // �������ͬ��
//        executorService.execute(() -> synchronizedExample2.func1());// ������Ĳ�ͬ��

        /**
         * ͬ��һ����
         */
        SynchronizedExample synchronizedExample = new SynchronizedExample();
        SynchronizedExample synchronizedExample1 = new SynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->synchronizedExample.func2());
        executorService.execute(()->synchronizedExample1.func2());
    }

    // ͬ��һ����̬����
    // ������������
    public synchronized static void fun() {

    }
}
