package com.javaHightRanking.thread.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *@Description ͨ��Runnable��ThreadPoolʵ�ִ����߳� 
 *@CreateDate 2020\3\15 0015 13:11
 *@Author zohn
 *@Version 1.0
 */
public class ThreadDemo4 implements Runnable{
    @Override
    public void run() {
        System.out.println("ͨ���̳߳�+runnableʵ�ֶ��̣߳����ƣ�"+Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new ThreadDemo4());
        }
        System.out.println("���߳�����:" + Thread.currentThread().getName());
        //�ر��̳߳�
        executorService.shutdown();
    }

}
