package com.book.xdclass;

/**
 *@Description i++ ����++i �ķ��ؽ��
 *@CreateDate 2020\3\13 0013 10:28
 *@Author zohn
 *@Version 1.0
 */
public class IPlusPlusTest {
    public static void main(String[] args) {
        int i = returnTest();
        int i02 = returnTest02();

        System.out.println("======^_^======����iֵΪ: " + i + ", ����i02ֵΪ: " +i02+ ", ��ǰ���Լ�����������: IPlusPlusTest.main()");
    }

    static int returnTest(){
        int i = 10;
        return i ++ ;
    }

    static int returnTest02(){
        int i = 10;
        return ++ i ;
    }
}
