package com.javase.map;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Description ��Java�б���HashMap��5����ѷ���
 * @CreateDate 2020/4/2 20:27
 * @Author zohn
 * @Version 1.0
 */
public class IteratorHashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap() {{
            put(1, "C");
            put(2, "C++");
            put(3, "Java");
            put(4, "Spring Framework");
            put(5, "Hibernate ORM framework");
        }};

        // ͨ��EntrySet����
        iteratorByEntrySet(hashMap);

        // ͨ��KeySet����
        iteratorByKeySet(hashMap);

        // ͨ��for-each����map
        iteratorByForEach(hashMap);

        // ͨ��lambda����map
        iteratorByLambda(hashMap);

        // ͨ��stream API����map
        iteratorByStreamAPI(hashMap);
    }

    /**
     * @Description ʹ��Iterator����HashMap EntrySet
     * @Author zohn
     * @Date 2020/4/2 20:31
     * @Param [hashMap]
     * @Return void
     */
    static void iteratorByEntrySet(@NotNull HashMap<Integer, String> hashMap) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    /**
     * @Description ʹ��Iterator����HashMap KeySet
     * @Author zohn
     * @Date 2020/4/2 20:37
     * @Param [hashMap]
     * @Return void
     */
    static void iteratorByKeySet(HashMap<Integer, String> hashMap) {
        Iterator<Integer> keySet = hashMap.keySet().iterator();
        while (keySet.hasNext()) {
            Integer key = keySet.next();
            System.out.println(key);
            System.out.println(hashMap.get(key));
        }
    }

    /**
     * @Description ʹ��for-each����map
     * @Author zohn
     * @Date 2020/4/2 20:47
     * @Param [hashMap]
     * @Return void
     */
    static void iteratorByForEach(HashMap<Integer, String> hashMap) {
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()
        ) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    /**
     * @Description ʹ��lambda����map
     * @Author zohn
     * @Date 2020/4/2 21:12
     * @Param [hashMap]
     * @Return void
     */
    static void iteratorByLambda(HashMap<Integer, String> hashMap) {
        hashMap.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v);
        });
    }

    /**
     * @Description ʹ��streamAPI����map
     * @Author zohn
     * @Date 2020/4/2 21:14
     * @Param [hashMap]
     * @Return void
     */
    static void iteratorByStreamAPI(HashMap<Integer, String> hashMap) {
        hashMap.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }
}
