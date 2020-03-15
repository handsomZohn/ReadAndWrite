package com.javaHightRanking.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class XdTest {
    private int num = 0;
    //ʹ?��lock��ÿ��������������ֻ�л��������ſ��Խ�?��?��Ӧ�Ĳ���
    Lock lock = new ReentrantLock();

    public void add1() {
        lock.lock();
        try {
            num++;
        } finally {
            lock.unlock();
        }
    }

    //ʹ?��synchronized����������?һ������������Ǳ�֤?��������ס?���ѣ��������Ǵ���鱻��ס
    public synchronized void add2() {
        num++;
        int minPriority = Thread.MIN_PRIORITY;
        int maxPriority = Thread.MAX_PRIORITY;
    }
}
