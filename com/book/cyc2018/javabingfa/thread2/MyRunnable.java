package com.book.cyc2018.javabingfa.thread2;

/**
 *@Description  ʵ��Runnable�ӿ�
 *@CreateDate   18/07/23 16:16
 *@Author        zohn
 *@Version       1.0
 *
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable run MyRunnable run");
    }

    public static void main(String[] args) {
        MyRunnable instance = new MyRunnable();
        Thread thread = new Thread(instance);
        thread.start();
    }
}
