package com.jvm;

import java.util.ArrayList;

/**
 * @Description ���ڴ����
 * @CreateDate 18/07/31 9:00
 * @Author zohn
 * @Version 1.0
 */
public class Duiyichu {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(new Duiyichu()); // java.lang.OutOfMemoryError: Java heap space
        }
    }
}
