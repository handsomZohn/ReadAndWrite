package com.book.cyc2018.javabingfa.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Description һ��֮����ֹ ע��д������requestStop���Ͷ�������stopRequested������ͬ���ˡ�
 * ֻͬ��д������������ʵ���ϣ��������д����û�ж�ͬ����ͬ���Ͳ��������á�
 * @CreateDate 18/08/07 15:46
 * @Author zohn
 * @Version 1.0
 */
public class FixStopThread {
    private static boolean stopRequested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            int i = 0;
            while (!stopRequested()) {
                i++;
                System.out.println(i + "sml");
            }
        }).start();
        TimeUnit.SECONDS.sleep(1);// 15�����һ���13��Ҳ����16�� ��ѧ��һ�����߳�˯�ŵİ취 Ч�ʸ��ߵ�
        // Thread.sleep(1000); // 15��
        requestStop();
    }
}
