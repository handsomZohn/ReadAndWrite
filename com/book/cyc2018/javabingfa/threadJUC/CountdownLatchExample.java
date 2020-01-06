package com.book.cyc2018.javabingfa.threadJUC;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:CountdownLatch ��������һ���̵߳ȴ�����̡߳�
 * ά��һ��������cnt��ÿ�ε���countDown()�������ü�������ֵ��1��
 * ����0��ʱ����Щ��Ϊ����await�����������ȴ����߳̾ͻᱻ���ѡ�
 * @Author: zohn
 * @CreateDate: 2018/7/28 10:25
 * @UpdateUser: zohn
 * @UpdateDate: 2018/7/28 10:25
 * @UpdateRemark: �޸�����
 * @Version: 1.0
 */
public class CountdownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(() -> {
                System.out.print("run...");
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        System.out.println("end");
        executorService.shutdown();
    }
}
