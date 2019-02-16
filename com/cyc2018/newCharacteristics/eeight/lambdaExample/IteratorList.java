package com.cyc2018.newCharacteristics.eeight.lambdaExample;

import java.util.Arrays;
import java.util.List;

/**
 *@Description  ʹ��lambda���ʽ���б���е��� ��Լ����࣬����Ĳ������ǽ��е���
 *@CreateDate   18/07/19 10:57
 *@Author        zohn
 *@Version       1.0
 *
 */
public class IteratorList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Lambda", "Default Method", "Stream  API", "Date And Time");
        // 1.8֮ǰ
        for (String l : list) {
            System.out.println(l);
        }
        // 1.8֮��
        // lambda���ʽ
        list.forEach(str -> System.out.println(list));
        list.forEach(str -> System.out.println(str));
        // ��������
        list.forEach(System.out::print);
    }
}
