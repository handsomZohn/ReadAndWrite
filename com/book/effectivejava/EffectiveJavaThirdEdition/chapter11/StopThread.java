package com.book.effectivejava.EffectiveJavaThirdEdition.chapter11;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description  ͬ��д��ʱ�� ҲҪͬ����ȡ��
 * @Author zohn
 * @Date 2019/12/22 19:15
 * @Param
 * @Return
 */
public class StopThread {
    private static boolean stopRequested;

    // ============================
    private static synchronized void requestStop(){
        stopRequested = true;
    }

    private static synchronized boolean stopRequested (){
        return stopRequested;
    }

    // ============================

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            // ͬ���ġ���
            while (!stopRequested()) {
                i++;
                System.out.println("======^_^======����iֵΪ: " + i + ", " + "��ǰ���Լ�����������: StopThread.main()");
            }
        });

        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);

        // stopRequested = true;
        // ============================
        // ͬ��д
        requestStop();
        // ============================
    }

    // �������к� i++ ��������ԭ�ӵġ���ȡ�����������
    private static  final AtomicLong nextSerialNumber = new AtomicLong();

    public static long generateSerialNumber(){
        return nextSerialNumber.getAndIncrement();
    }

    // ��ȫ�����������õķ�����
    // ��һ�����ʷ�����������ô��֤���ݵİ�ȫ�ԣ�
     // ��̬��volatile��final�������������ʵ��򡢷��벢��������

}
