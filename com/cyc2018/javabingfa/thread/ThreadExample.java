package com.cyc2018.javabingfa.thread;

/**
 *@Description  ��lambda�����߳�
 *@CreateDate   18/07/19 9:42
 *@Author        zohn
 *@Version       1.0
 *
 */
public class ThreadExample {
    public static void main(String[] args) {
        // 1.8֮ǰ
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8");
            }
        }).start();
        // 1.8֮�� ��lambda֮���úܼ��
        new Thread(()-> System.out.println("After Java8")).start();
    }
}
