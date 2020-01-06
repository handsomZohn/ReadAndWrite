package com.thePublic.smile.shengchanxiaofei;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *@Description  ÿ���̵߳���һ��������
 *@CreateDate   18/08/13 9:01
 *@Author        zohn
 *@Version       1.0
 *
 */
public class Producer implements Runnable{
    private boolean working = true;
    private BlockingQueue<Food> queue;
    private static AtomicInteger count = new AtomicInteger();

    // ���캯��
    public Producer(BlockingQueue<Food> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (working) {
            int id = count.incrementAndGet();
            Food food = new Food(id);
            if (queue.offer(food)) {
                System.out.println(Thread.currentThread().getId() + "��Ա����" + food.getId() + "��ʳ������̨");
            } else {
                System.out.println("��̨������" + food.getId() + "��ʳ���޷�����");
            }
            try {
                // Thread.sleep(1000*3);
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
