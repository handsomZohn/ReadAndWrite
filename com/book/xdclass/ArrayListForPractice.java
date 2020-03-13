package com.book.xdclass;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListForPractice {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> list = Collections.synchronizedList(arrayList);

        List<String> copyOnWriteList = new CopyOnWriteArrayList<>();
    }

    @Test
    public void arrayListTest() {
        List<String> list = new ArrayList<>();
        System.out.println("======^_^======����list.size()ֵΪ: " + list.size() + ", " + "��ǰ���Լ�����������: " +
                "ArrayListForPractice.arrayListTest()");
        for (int i = 0; i < 10; i++) {
            list.add("" + i);
        }
        System.out.println(list.size());
        list.add("xdclass.net");
        System.out.println(list.size());
    }
/*
    //��������?+ȷ������?
    private void ensureCapacityInternal(int minCapacity) {
//����ǳ������ݣ���ʹ?��Ĭ�ϵ�����?
        if (elementData == EMPTY_ELEMENT_DATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }
//�Ƿ���Ҫ���ݣ���Ҫ����������??�������������?������Ҫ����
        if (minCapacity - elementData.length > 0) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
//���������? < ��?С����?�� �����µ�����?��ֵ���µ�����?
            if (newCapacity - minCapacity < 0) {
                newCapacity = minCapacity;
            }
//����������
            Object[] objects = new Object[newCapacity];
//���ɵ����鸴�Ƶ��µ�����?��??��
            System.arraycopy(elementData, 0, objects, 0, elementData.length);
//�޸���?��
            elementData = objects;
        }*/
    }
