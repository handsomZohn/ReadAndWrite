package com.io.nio2;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.security.SecureRandom;

/**
 * @Description ����ByteBuffer��һ��ʲô��
 * @CreateDate 18/10/09 14:34
 * @Author zohn
 * @Version 1.0
 */
public class ForByteBuffer {
    public static void byteBufferTest() {
        // �ǳ�����Buffer
        // Buffer��ֱ������ Ҳ�ǳ����� ���ܱ�ʵ����
        //ByteBuffer byteBuffer = n

        System.out.println("-----test allocate-----");
        System.out.println("Before allocate:" + Runtime.getRuntime().freeMemory());

        // ΪByteBuffer�����ڴ� ���ַ������RAM ���Ƿ�����������ڴ�
        // while (true) {
        ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024 * 1024);// 1024byte = 1kb
        System.out.println("buffer:" + buffer);

        System.out.println("After allocate:" + Runtime.getRuntime().freeMemory());
        // }

        System.out.println("-----test wrap-----");
        byte[] bytes = new byte[32];
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        System.out.println(wrap);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes, 10, 10);
        System.out.println(byteBuffer);
    }

    public static void flipTest() {
        IntBuffer intBuffer = IntBuffer.allocate(10);// ����һ��int������
        // ��������
        for (int i = 0; i < 5; i++) {
            int nextInt = new SecureRandom().nextInt(10);
            intBuffer.put(nextInt);
        }

        // ��ȡ����
        intBuffer.flip();// buffer�Ķ�дת��ȫ��flip����ʵ��
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }


    }


    public static void flipTest02() {
        IntBuffer intBuffer = IntBuffer.allocate(20);

        System.out.println("buffer capacity : " + intBuffer.capacity());

        for (int i = 0; i < 20; i++) {
            int nextInt = new SecureRandom().nextInt(20);
            intBuffer.put(nextInt);
        }

        System.out.println("before flip limit is : " + intBuffer.limit());
        System.out.println("before flip position is : " + intBuffer.position());

        intBuffer.flip();
        // ���������flip�����������,���������buffer����Ŀ�λ�õ�Ĭ��ֵ ����int��Ĭ��ֵ��0
        // ���������Ҳ������������ֵ
        // enter while loop: 0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-
        // enter while loop: 18-12-3-11-3-

        System.out.println("after flip limit is : " + intBuffer.limit());
        System.out.println("after flip position is : " + intBuffer.position());

        System.out.print("enter while loop: ");

        while (intBuffer.hasRemaining()) {
            System.out.print(intBuffer.get() + "-");
        }
    }


    public static void main(String[] args) {
        // byteBufferTest();
        // flipTest();
        flipTest02();
        //System.out.println(1024*1024*1024);
    }
}
