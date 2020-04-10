package com.javase.map;

import java.util.HashMap;
import java.util.Map;

public class PutOfHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        String key = "����";
        map.put(key, "С��");
        // ��һ������ȡ��key��hashCodeֵ
        int i = key.hashCode();
        System.out.println("======^_^======variable i value is : " + i + ", " + " current method and class name is : PutOfHashMap.main()");

        // �ڶ�����ͨ��hash�㷨�ĺ��������㣨��λ�����ȡģ���㣩����λ�ļ�ֵ�ԵĴ洢λ��
        int i1 = i ^ (i >>> 16);
        System.out.println("======^_^======variable i1 value is : " + i1 + ", " + " current method and class name is : PutOfHashMap.main()");

        int i2 = i1 & (map.size() - 1);
        System.out.println("======^_^======variable i2 value is : " + i2 + ", " + " current method and class name is : PutOfHashMap.main()");
    }
}
