package com.javase.programmer;

public class SwitchTest {
    /**
     * switch�﷨��������ƥ����û��break�������case��Ҳ��ִ��
     * ��Ϊû��дbreak��ʱ��һ��ƥ����֮�󣬲�����ȥУ�������case����ֱ��ִ�������case
     * @param args
     */
    public static void main(String[] args) {
        int condition = 1;
        switch (condition) {
            case 1 :
                System.out.println(1);
                // break;
            case 2 :
                System.out.println(2);
                break;
            case 3 :
                System.out.println(3);
                break;
        }
    }
}
