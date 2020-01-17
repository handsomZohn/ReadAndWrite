package com.javase.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Description java ��ȡ����������
 * @Author zohn
 * @Date 2020\1\14 0014 16:48
 * @Param
 * @Return
 */
public class GetInputFromKeyboard {


    public static void main(String[] args) {
        getInput();
    }

    /**
     * @Description ��ȡ�����
     * @Author zohn
     * @Date 2020\1\14 0014 16:49
     * @Param []
     * @Return void
     */
    public static void getInput() {

        // ��һ�ַ���
        System.out.println("type your name:");
        Scanner input = new Scanner(System.in);
        String string1 = input.nextLine();
        System.out.println("======^_^======����string1ֵΪ: " + string1 + ", " + "��ǰ���Լ�����������: GetInputFromKeyboard.getInput()");

        // �ڶ��ַ���
        System.out.println("type your name002:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string = bufferedReader.readLine();
            System.out.println("======^_^======����stringֵΪ: " + string + ", " + "��ǰ���Լ�����������: GetInputFromKeyboard.getInput()");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
