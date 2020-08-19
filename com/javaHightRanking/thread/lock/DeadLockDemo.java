package com.javaHightRanking.thread.lock;

/**
 * @Description ����demo
 * @Author z
 * @Date 2020\8\19 0019 13:55
 * @Param 
 * @Return 
 */
public class DeadLockDemo {
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
            synchronized (lockb) {
                System.out.println("����A�����л������B" + Thread.currentThread().getName());
            }
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
            synchronized (locka) {
                System.out.println("����B�����л������A" + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("���߳����п�ʼ��" + Thread.currentThread().getName());
        DeadLockDemo deadLockDemo = new DeadLockDemo();
        new Thread(() -> {
            deadLockDemo.methodA();
        }).start();
        new Thread(() -> {
            deadLockDemo.methodB();
        }).start();
        System.out.println("���߳����н�����" + Thread.currentThread().getName());
    }
}
