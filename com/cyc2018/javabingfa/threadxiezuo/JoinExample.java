package com.cyc2018.javabingfa.threadxiezuo;

/**
 *@Description  �߳�֮���Э��-join
 *@CreateDate   18/07/26 11:29
 *@Author        zohn
 *@Version       1.0
 *
 */
public class JoinExample {
    private class A extends Thread {
        @Override
        public void run() {
            System.out.println("A");
        }
    }
    private class B extends Thread {
        private A a;
        B(A a) {
            this.a = a;
        }

        @Override
        public void run() {
            try {
                a.join();// ��b�е���a b�̻߳�ȵ�a�߳̽����ż���ִ�� ����a�̵߳����������b�߳�
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public void test () {
        A a = new A();
        B b = new B(a);
        b.start();// b�߳������� ����a�߳����������
        a.start();
    }

    public static void main(String[] args) {
        JoinExample joinExample = new JoinExample();
        joinExample.test();
    }

}
