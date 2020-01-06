package com.book.cyc2018.javabingfa.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Description volatile ��֤�κ�һ���߳��ڶ�ȡ�����ʱ�򶼽���������д���ֵ��
 * @CreateDate 18/08/07 16:05
 * @Author zohn
 * @Version 1.0
 */
public class FixStopThread02 {
    private static volatile boolean stopRequested;

    public static void main(String[] args) {
        new Thread(() ->{
            int i = 0;
            while (!stopRequested) {// �´����߳̿��Կ��������߳��޸Ĺ���ֵ;
                i++;
                System.out.println(i + "sml");
            }
        }).start();
        try {
            TimeUnit.SECONDS.sleep(1);
            stopRequested = true;// ���̸߳���ֵ
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
