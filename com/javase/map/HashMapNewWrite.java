package com.javase.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Description ������ʽдHashMap
 * @CreateDate 18/08/09 13:38
 * @Author zohn
 * @Version 1.0
 */
public class HashMapNewWrite {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap() {{
            put("name", "����");
            put("name", "����");// �����ظ�
            put("age", "20");
            put("birthday", "1995-01-30");
            put(null,"123");
        }};

        // ����map

        // ��һ��
        System.out.println("\nͨ��Map.keySet����key��value");
        for (String key : hashMap.keySet()) {
            System.out.println("Key:" + key + " Value:" + hashMap.get(key));
        }

        // �ڶ���
        System.out.println("\nͨ��Map.entrySetʹ��iterator����key��value");
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println("Key:" + next.getKey() + " Value:" + next.getValue());
        }

        // ������ �Ƽ� �������������ʱ��
        System.out.println("\nͨ��Map.entrySet����key��value");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }

        // ������
        System.out.println("\nͨ��Map.values()�������е�value�����ǲ��ܱ���key");
        for(String v: hashMap.values()){
            System.out.println(v);
        }

        //
        System.out.println("��ȡkeyΪnull��ֵ��");
        String key = null;
        if (hashMap.containsKey(key)){
            System.out.println("Value:" + hashMap.get(key));
        }
        if (true)
                ;
            else
                ;
    }
}
