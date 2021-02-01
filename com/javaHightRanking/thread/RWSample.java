package com.javaHightRanking.thread;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description ¶ÁËø Ğ´Ëø Àı×Ó
 * @Author z
 * @Date 2021\2\1 0001 17:53
 * @Param 
 * @Return 
 */
public class RWSample {
    private final Map<String, String> map = new TreeMap<>();
    private final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    private final Lock rLock = reentrantReadWriteLock.readLock();
    private final Lock wLock = reentrantReadWriteLock.writeLock();

    public String get (String key){
        rLock.lock();
        System.out.println("¶ÁËøËø¶¨");
        try {
            return map.get(key);
        } finally {
            rLock.unlock();
        }
    }

    public String put (String key, String value) {
        wLock.lock();
        System.out.println("Ğ´ËøËø¶¨");
        try {

        } finally {
            wLock.unlock();
        }
        return "";
    }

}
