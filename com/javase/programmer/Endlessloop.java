package com.javase.programmer;

/**
 * @Description ��ѭ��
 * @Author zohn
 * @Date 2020\1\6 0006 15:07
 * @Param 
 * @Return 
 */
public class Endlessloop {
    public static void main(String[] args) {

        // ����ѭ������һ��д��
        for (;;) {
            System.out.println(110);
            break;
        }

        while (true) {
            System.out.println(110);
            break;
        }
    }
}
