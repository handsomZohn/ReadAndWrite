package com.javaHightRanking.thread.lock;

/**
 *@Description dclÀý×Ó
 *@CreateDate 2020\6\4 0004 15:46
 *@Author z
 *@Version 1.0
 */
public class DoubleCheckLock {
    private volatile static DoubleCheckLock doubleCheckLock;

    private DoubleCheckLock(){}

    public DoubleCheckLock getInstance() {
        if (doubleCheckLock == null) {
            synchronized (DoubleCheckLock.class) {
                if (doubleCheckLock == null) {
                    doubleCheckLock = new DoubleCheckLock();
                }
            }
        }
        return doubleCheckLock;
    }
}
