package com.book.cyc2018.javabingfa.xianchengchi;

/**
 * @Description ͨ������һ���̵߳�interrupt()���ж��߳� ������̳߳������������ڵȴ����������ڵȴ� �ͻ��׳�InterruptedException
 * �Ӷ���ǰ�������̡߳����ǲ����ж�IO������synchronized��������
 * @CreateDate 18/07/23 17:16
 * @Author zohn
 * @Version 1.0
 */
public class InterruptedException {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);// sleep()���ܻ��׳�InterruptedException ��Ϊ�쳣���ܿ��̴߳�����main()��
                // ��˱����ڱ��ش���
                System.out.println("Thread  Run");
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.interrupt();
            System.out.println("Main Run");
        }
    }


    private static class MyThread2 extends Thread {
        @Override
        public void run() {
            while (!interrupted()) {
                System.out.println("myThread2 has been not interrupted");
            }
            System.out.println("Thread End");
        }

        public static void main(String[] args) throws java.lang.InterruptedException {
            MyThread2 myThread2 = new MyThread2();
            myThread2.start();
            Thread.sleep(5000); // ����10�� interrupt
            myThread2.interrupt();
        }
    }
}
