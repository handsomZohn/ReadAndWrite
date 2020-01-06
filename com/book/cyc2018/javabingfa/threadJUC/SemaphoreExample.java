package com.book.cyc2018.javabingfa.threadJUC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
* @Description: semaphore���ǲ���ϵͳ�е��ź��������Կ��ƶԻ�����Դ�ķ����߳�����
 * ģ���ĳ������Ĳ�������ÿ��ֻ���������ͻ���ͬʱ���� ������Ϊ10
* @Author:         zohn
* @CreateDate:     2018/7/28 11:56
* @UpdateUser:     zohn
* @UpdateDate:     2018/7/28 11:56
* @UpdateRemark:   �޸�����
* @Version:        1.0
*/
public class SemaphoreExample {
    public static void main(String[] args) {
        final int clientCount = 3;
        final int totalRequestCount = 10;
        Semaphore semaphore = new Semaphore(2);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalRequestCount; i++) {
            executorService.execute(()->{
                try {
                    semaphore.acquire();
                    System.out.print(semaphore.availablePermits() + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            });
        }
        executorService.shutdown();
    }
}
