package com.book.cyc2018.javabingfa.thread2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *@Description  ʵ��Callable ��Runnable��� Callable�з���ֵ������ֵͨ��FutureTaskʵ��           JDK1.5֮���ṩ 50
 * �������ӿ��Կ����� Callable �� Future�ӿڵ�����
 *   ��1��Callable�涨�ķ�����call()����Runnable�涨�ķ�����run().
 *   ��2��Callable������ִ�к�ɷ���ֵ����Runnable�������ǲ��ܷ���ֵ�ġ�
 *   ��3��call()�������׳��쳣����run()�����ǲ����׳��쳣�ġ�
 *   ��4������Callable������õ�һ��Future���� Future��ʾ�첽����Ľ����
 *   ���ṩ�˼������Ƿ���ɵķ������Եȴ��������ɣ�����������Ľ����
 *   ͨ��Future������˽�����ִ���������ȡ�������ִ�У����ɻ�ȡ����ִ�еĽ����
 *   Callable��������Runnable�Ľӿڣ�ʵ��Callable�ӿڵ����ʵ��Runnable���඼�ǿɱ������߳�ִ�е�����
 *@CreateDate   18/07/23 16:53
 *@Author        zohn
 *@Version       1.0
 *
 */
public class MyCallable implements Callable{
    @Override
    public Integer call() throws Exception {
        return 123;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException{
        MyCallable myCallable = new MyCallable();
        FutureTask futureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}
