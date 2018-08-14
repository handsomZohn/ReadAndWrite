package com.jvm;

/**
 *@Description  Õ»ÄÚ´æÒç³ö
 *@CreateDate   18/07/31 9:05
 *@Author        zohn
 *@Version       1.0
 *
 */
public class Zhanyichu {
    public static void main(String[] args) {
        new Zhanyichu().test();
    }

    public void test () {
        test(); // java.lang.StackOverflowError
    }
}
