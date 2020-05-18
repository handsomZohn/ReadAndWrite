package com.book.cyc2018.javabingfa.thread;

import static java.lang.Thread.currentThread;

/**
 * Created by zohn on 2016-09-27.
 * 1��extends Thread
 * 2��implements Runnable
 */
public class Thread01 {

    public static void main(String[] args) {

       //��һ�ִ����̵߳ķ�ʽ new Thread(){}.start();
        new Thread(){
                    @Override
                    public void run(){
                try {
                    int i = 0;
                    while (i<2){
                        //TimeUnit.SECONDS.sleep(1); //�ߵ�����ط���ͣһ��
                       // TimeUnit.MINUTES.sleep(1);   //�ߵ�����㣬ͦһ����
                        System.out.println("1name:"+currentThread().getName());
                        i++;
                    }
                }catch (Exception  e){
                    e.printStackTrace();
                }
            }
        }.start(); //����.start();��ʾ�ø��߳�����

        // �ڶ��ִ����̵߳ķ�ʽ  new Thread(Runnable target,String name).start();
        // ������lambda�滻������
        new Thread(new Runnable(){
                    public void run(){
                        try {
                    int i = 0;
                    while (i<2){
                        System.out.println("2name:"+currentThread().getName());
                        i++;
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        },"Thread-zidingyi").start(); //"Thread-�Լ��������" �ɱ�������Ǵ��� �̵߳����֣�zidingyi��

        //�����ַ�ʽ������� ���������������ģ�������ӡ��� new Thread(Runnable target,String name){}.start();
        new Thread(new Runnable(){
            public void run(){
                try {
                    int i = 0;
                    while (i<2){
                        System.out.println("3name:"+currentThread().getName());
                        i++;
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        },"All Over The World"){
            @Override
            public void run(){
                try {
                    int i = 0;
                    while (i<2){
                        System.out.println("4name:"+currentThread().getName());
                        i++;
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }.start();
        /*
        �������̸߳���û���������Ϊ�������� �߳� ֻ������һ����
        �����������̳���Thread������Thread�����run���������ˡ�
         */


      //main ����
    }

    //��
}
