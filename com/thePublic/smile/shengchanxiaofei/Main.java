package com.thePublic.smile.shengchanxiaofei;

import java.util.concurrent.*;

/**
 *@Description  ���̵߳��� ʹ���̳߳ض��߳̽��з���
 * �����ݶ��ж���Ϊ10��Ԫ�ؿռ�
 * �̳߳�ʹ��newFixedThreadPool��ʽ���涨�����̣߳���ʼ��3�������ߺ�15��������
 *@CreateDate   18/08/13 9:19
 *@Author        zohn
 *@Version       1.0
 *
 */
public class Main {
    public static void main(String[] args) {
        BlockingQueue<Food> queue = new LinkedBlockingDeque<>(10);
        Producer[] producers = new Producer[3];
        Consumer[] consumers = new Consumer[15];

        for (int i = 0; i < 3; i++) {
            producers[i] = new Producer(queue);
        }

        for (int j = 0; j < 15; j++) {
            consumers[j] = new Consumer(queue);
        }

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 3; i++) {
            executorService.execute(producers[i]);
        }

        for (int j = 0; j < 15; j++) {
            executorService.execute(consumers[j]);
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
