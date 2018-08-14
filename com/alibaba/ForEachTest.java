package com.alibaba;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *@Description  
 *@CreateDate   18/07/30 17:42
 *@Author        zohn
 *@Version       1.0
 *
 */
public class ForEachTest {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();// diamondÓï·¨
        arrList.add("1");
        arrList.add("2");
        arrList.add("3");
        // ÕýÀý
        Iterator<String> iterator = arrList.iterator();
        while (iterator.hasNext()) {
            String string = (String) iterator.next();
            if ("1".equals(string)) {
                iterator.remove();
            }
        }

        // ·´Àý
//		for (String string : arrList) {
//			if ("1".equals(string)) {
//				arrList.remove(string);// java.util.ConcurrentModificationException
//			}
//		}
        System.out.println(arrList.toString());

    }

}
