package com.book.cyc2018.javabingfa.thread;

import java.util.concurrent.TimeUnit;

/**
 *@Description  Thread.stop. ����û��ͬ�����Ͳ��ܱ�֤��̨�̺߳�ʱ�����������̶߳�stopRequested��ֵ�����ĸı�
 *@CreateDate   18/08/07 15:30
 *@Author        zohn
 *@Version       1.0
 *
 */
public class StopThread {
    private static boolean stopRequest;
    public static void main(String[] args) {
        new Thread(() ->{
            int i = 0;
            while (!stopRequest) {// �������߳̿��������̶߳�stopRequest�������޸� ���Ծͻ�һֱ���У�
                i++;
            }
        }).start();

        try {
            TimeUnit.SECONDS.sleep(1);
            stopRequest = true;// ���߳����޸�
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    // û��ͬ�� �������������룺
    // while (!done)
    //     i++;
    // ת��Ϊ
    // if ()
    //     while(true)
    //         i++
    // �����Ż�����������hoisting������HopSpot Server VM�Ĺ���������Ǹ�����ʧ�ܣ�liveness failure����
    // ��������޷�ǰ��
    // ������������һ�ֽ����ʽ��ͬ������stopRequested��
}
