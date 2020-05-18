package com.javase.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description mapתΪlist
 * @CreateDate 2020/4/4 17:03
 * @Author zz
 * @Version 1.0
 */
public class Map2List {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        map.put("4", "D");
        map.put("5", "E");
        List<String> keylist = new ArrayList<>(map.keySet());
        for (String key : keylist) {
            System.out.println(key);
        }

        //List<String> valuesList = (List<String>) map.values();        //map.values()���ص���collection��ͨ��arrayList�Ĺ��췽������ʵ��

        List<String> valuesList = new ArrayList<String>(map.values());

        for (String str : valuesList) {
            System.out.println(str);
        }

    }
}
