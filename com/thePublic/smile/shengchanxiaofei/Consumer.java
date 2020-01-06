package com.thePublic.smile.shengchanxiaofei;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 *@Description  ÿ���̵߳���һ��������
 *@CreateDate   18/08/13 9:13
 *@Author        zohn
 *@Version       1.0
 *
 */
public class Consumer implements Runnable {
    private boolean working = true;
    private BlockingQueue<Food> queue;

    public Consumer(BlockingQueue<Food> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Food food = queue.take(); // take��ʽ����������û��Ԫ�� ���߳�����
                System.out.println(food.getId() + "��ʳ���ѱ�" + Thread.currentThread().getId() + "�Ź˿Ͷ���");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
