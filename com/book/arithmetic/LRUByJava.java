package com.book.arithmetic;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *@Description ��дһ��java�汾��lru
 *@CreateDate 2021\2\8 0008 13:59
 *@Author z
 *@Version 1.0
 */
public class LRUByJava<K,V> extends LinkedHashMap<K,V> {
    private int CACHE_SIZE;
    /**
     * ���ݽ����ܻ����������
     * @param cacheSize �����С
     */
    public LRUByJava(int cacheSize){
        // true��ʾ��linkedHashMap���շ���˳��������������ʵ�����ͷ�������ȣ��ϣ����ʵ�����β��
        super((int)Math.ceil(cacheSize/0.75) + 1, 0.75f,true);
        CACHE_SIZE = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        // ��map�е�����������ָ���Ļ���ĸ�����ʱ�򣬾��Զ�ɾ�����ϵ�����
        return size() > CACHE_SIZE;
    }
    public static void main(String[] args) {
        System.out.println(2>>>3);
    }
}
