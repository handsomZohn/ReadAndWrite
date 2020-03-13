package com.javaHightRanking.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyTask implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println("ͨ��Callableʵ�ֶ��̣߳��� �ƣ�" + Thread.currentThread().getName());
        return "���Ƿ���ֵ";
    }

    public static void main(String[] args) {
        FutureTask<Object> futureTask = new FutureTask<>(() -> {
            System.out.println("ͨ��Callableʵ�ֶ��̣߳����� " + Thread.currentThread().getName());
            return "���Ƿ���ֵ";
        });
    // MyTask myTask = new MyTask();
    // FutureTask<Object> futureTask = new FutureTask<>(myTask);
    //FutureTask�̳���?Runnable�����Է���Thread������ִ?��?
        Thread thread = new Thread(futureTask);
        thread.setName("demo3");
        thread.start();
        System.out.println("���߳��� ��:" + Thread.currentThread().getName());
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
//�����ȴ��б��жϣ����׳�
            e.printStackTrace();
        } catch (ExecutionException e) {
//ִ?��?���̷����쳣���׳�
            e.printStackTrace();
        }
    }
}
