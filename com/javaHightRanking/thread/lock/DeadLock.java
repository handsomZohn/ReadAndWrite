package com.javaHightRanking.thread.lock;
/**
 *@Description
 *@CreateDate   18/10/19 10:19
 *@Author        zohn
 *@Version       1.0
 *https://www.cnblogs.com/pullein/p/6232119.html
 */
// ������
//�γ�������������
// 1.���⣺�й�����Դ��������
// 2.���������󣺵�ǰ�߳����ٳ���һ����Դ�����ڵȴ���ȡ�������̳߳��е���Դ
// 3.�ǰ��᣺�������Դ���ܴ���Ӧ���߳��б�ǿ�ư���[������ռ�е���Դ���ܱ�ǿ������]
// 4.ѭ���ȴ�����һ���̵߳ȴ��ڶ����̣߳��ڶ����߳����ڵȴ���һ���̣߳��γ�[��·]
//������Ԥ����
// 1.������˳��ȷ�����е��̰߳�����ͬ��˳������[��Ҫ����֪�����õ���������ʱ���޷�Ԥ֪]
// 2.������ʱ�ޣ��ڳ��Ի�ȡ����ʱ���һ����ʱʱ�ޣ��������ʱ�ޣ�������Ը���������Ȼ����л��ˣ����ͷ������ѻ�õ�����
// 3.������⣺
//
//
public class DeadLock {

    static Object lockA = new Object();
    static Object lockB = new Object();

    // ����ط�������debugģʽ����  debugģʽ�����ǵ��̡߳�
    // ��run��ʽ���У�debugģʽ����ÿ�ζ����������߳�������
    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (lockA) {
                System.out.println("��һ���̵߳���A");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockB) {
                    System.out.println("��һ���̵߳���B");
                }
            }
        }).start();


        new Thread(() -> {

            synchronized (lockB) {
                System.out.println("�ڶ����̵߳���B");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockA) {
                    System.out.println("�ڶ����̵߳���A");
                }
            }

        }).start();
    }
}

