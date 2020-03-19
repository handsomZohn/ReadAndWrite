package com.thePublic.thinkMap;

import org.junit.Test;

/**
 *@Description �ж�һ�����Ƿ�Ϊ����
 *@CreateDate 2020\3\19 0019 15:36
 *@Author zohn
 *@Version 1.0
 */
public class Isodd {

    public void isodd(int i){
        if (i % 2 == 1){
            System.out.println("������");
        } else {
            System.out.println("��ż��");
        }
    }

    @Test
    public void isoddTest(){
        isodd(10);
    }

    public boolean isodd02(int i){
        // V1.00.00 �������⣺�����б�������booleanֵ��ֱ�ӷ��أ�����ΪV2.00.00

        // if (i % 2 == 1) {
        //     return true;
        // } else {
        //     return false;
        // }

        // V2.00.00 �������⣺������ݽ������Ǹ����أ�����ΪV3.00.00
        // return i % 2 == 1;

        // V3.00.00 �������⣺ == 1 �� == -1 ���غ󶼱�ʾ������ֻ�� == 0��ʾΪż��������ΪV3.10.00
        // return i % 2 == 1 || i % 2 == -1;

        // V3.10.00 �������⣺ȡģ�����Ƚ���  ����ΪV4.00.00
        // return i % 2 != 0;

        // V4.00.00 �������⣺�ٴ����� V5.00.00
        // return i >> 1 << 1 != i;

        // V5.00.00
        return (i & 1) == 1;

        // ��λ�������ȡģ������ʵ�����е�ʱ���ǲ��ģ�Ϊʲô�أ�
        // �������Ὣ��2��ָ����ȡģ�������Ż���λ���������
    }

    @Test
    public void isodd02Test(){
        boolean b = isodd02(20);
        System.out.println("======^_^======����bֵΪ: " + b + ", " + "��ǰ���Լ�����������: Isodd.isodd02Test()");
    }
}
