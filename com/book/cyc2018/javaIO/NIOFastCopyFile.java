package com.book.cyc2018.javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Description ʹ��NIO���ٸ����ļ�
 * @CreateDate 18/07/18 15:53
 * @Author zohn
 * @Version 1.0
 */
public class NIOFastCopyFile {
    public static void main(String[] args) throws IOException {
        String src = "d:\\licence.txt", dist = "e:\\licence.txt";
        System.out.println("�����ļ���ʼ��" + System.currentTimeMillis());
        fastCopyFile(src,dist);
        System.out.println("�����ļ�������" + System.currentTimeMillis());

    }

    /**
     * NIO���ٸ����ļ�
     *
     * @param src  Դ�ļ�
     * @param dist Ŀ���ļ�
     * @throws IOException
     */
    static void fastCopyFile(String src, String dist) throws IOException {
        // ��ȡԴ�ļ��������ֽ���
        FileInputStream fis = new FileInputStream(src);
        // ��ȡ�����ֽ������ļ�ͨ��
        FileChannel fisChannel = fis.getChannel();
        // ��ȡĿ���ļ�������ֽ���
        FileOutputStream fos = new FileOutputStream(dist);
        // ��ȡ����ֽ������ļ�ͨ��
        FileChannel fosChannel = fos.getChannel();
        // Ϊ����������1024���ֽ�
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
        while (true) {
            // ������ͨ���ж�ȡ���ݵ���������
            int r = fisChannel.read(buffer);
            // read() ����-1 ��ʾEOF
            if (r == -1){
                break;
            }
            buffer.flip();
            // �ѻ�����������д������ļ���
            fosChannel.write(buffer);
            // ��ջ�����
            buffer.clear();
        }
    }
    // NIO��IO��������Ҫ���������㣺
    // NIO�Ƿ������ġ�Ӧ��ע��:FileChannel�����л���������ģʽ���׽���Channel���ԣ�
    // NIO����飬IO������
}
