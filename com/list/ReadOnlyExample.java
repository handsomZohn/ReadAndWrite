package com.list;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @Description ͨ��Collections.unmodifiable...ʵ�ֲ��ɱ伯��
 * @CreateDate 18/10/10 16:17
 * @Author zohn
 * @Version 1.0
 */
public class ReadOnlyExample {

    // ���ɱ伯��
    public static void main(String[] args) {
        Set set = new HashSet();
        List list = new LinkedList();
        set.add("a");
        set.add("b");
        set.add("c");
        set = Collections.unmodifiableSet(set);
        list = Collections.unmodifiableList(list);
        set.add("d");// java.lang.UnsupportedOperationException
    }
}
