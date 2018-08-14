package com.cyc2018.javabingfa.threadJUC;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: �������ƶ���̻߳���ȴ���ֻ�е�����̶߳������ʱ����Щ�̲߳ż���ִ�С�
 * @Author: zohn
 * @CreateDate: 2018/7/28 11:41
 * @UpdateUser: zohn
 * @UpdateDate: 2018/7/28 11:41
 * @UpdateRemark: �޸�����
 * @Version: 1.0
 */
public class CyclicBarrierExample {
    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(() -> {
                System.out.print("before...");// �������
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.print("after...");// һ��ȫ�ĳ��� 10��
            });
        }
        executorService.shutdown();
    }
}
