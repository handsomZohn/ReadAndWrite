package com.javaHightRanking.jvm;

import java.util.ArrayList;

/**
 * @Description ¶ÑÄÚ´æÒç³ö
 * @CreateDate 18/07/31 9:00
 * @Author zohn
 * @Version 1.0
 */
public class Duiyichu {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            // java.lang.OutOfMemoryError: Java heap space
            arrayList.add(new Duiyichu());
        }
    }
}
