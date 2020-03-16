package com.javaHightRanking.thread.lock;

public class FixDeadLockDemo {
    private static String locka = "locka";
    private static String lockb = "lockb";

    public void methodA() {
        synchronized (locka) {
            System.out.println("����A�����л������A" + Thread.currentThread().getName());
            //�ó�CPUִ��Ȩ�����ͷ���
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (lockb) {
            System.out.println("����A�����л������B" + Thread.currentThread().getName());
        }
    }

    public void methodB() {
        synchronized (lockb) {
            System.out.println("����B�����л������B" + Thread.currentThread().getName());
            //�ó�CPUִ��Ȩ�����ͷ���
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (locka) {
            System.out.println("����B�����л������A" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("���߳����п�ʼ���У�" + Thread.currentThread().getName());
        FixDeadLockDemo deadLockDemo = new FixDeadLockDemo();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                deadLockDemo.methodA();
            }).start();
            new Thread(() -> {
                deadLockDemo.methodB();
            }).start();
        }
        System.out.println("���߳����н�����" + Thread.currentThread().getName());
    }
}
