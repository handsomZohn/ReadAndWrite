package com.javaHightRanking.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyTask implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println("通过Callable实现多线程，名 称：" + Thread.currentThread().getName());
        return "这是返回值";
    }

    public static void main(String[] args) {
        FutureTask<Object> futureTask = new FutureTask<>(() -> {
            System.out.println("通过Callable实现多线程，名称 " + Thread.currentThread().getName());
            return "这是返回值";
        });
    // MyTask myTask = new MyTask();
    // FutureTask<Object> futureTask = new FutureTask<>(myTask);
    //FutureTask继承了?Runnable，可以放在Thread中启动执?行?
        Thread thread = new Thread(futureTask);
        thread.setName("demo3");
        thread.start();
        System.out.println("主线程名 称:" + Thread.currentThread().getName());
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
//阻塞等待中被中断，则抛出
            e.printStackTrace();
        } catch (ExecutionException e) {
//执?行?过程发送异常被抛出
            e.printStackTrace();
        }
    }
}
