package com.cyc2018.javaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description ʹ���ֽ��������ļ�����
 * @CreateDate 18/07/18 14:15
 * @Author zohn
 * @Version 1.0
 */
public class ByteCopyFileExample {
    public static void main(String[] args) throws IOException {
        String src = "d:\\licence.txt", dist = "e:\\licence.txt";
        System.out.println("�����ļ���ʼ��" + System.currentTimeMillis());
        copyFile(src,dist);
        System.out.println("�����ļ�������" + System.currentTimeMillis());
        System.out.println("�����ļ���ʼ��" + System.currentTimeMillis());
        copyFile();
        System.out.println("�����ļ�������" + System.currentTimeMillis());
    }

    /**
     *
     * @param src ԭ�ļ�·��
     * @param dist Ŀ���ļ�·��
     * @throws IOException
     */
    static void copyFile(String src, String dist) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dist);
        byte[] buffer = new byte[20 * 1024];
        // read()����ȡbuffer.length���ֽڣ�����ʵ�ʶ�ȡ�ĸ���
        // ����-1��ʾ����eof�����ļ�β
        while (fis.read(buffer, 0, buffer.length) != -1){
            fos.write(buffer);
        }
        fos.close();
        fis.close();
    }

    // Java I/Oʹ��װ����ģʽ��ʵ�֡�
    // ��InputStreamΪ����InputStream�ǳ������ FileInputStream��InputStream�����࣬�Ǿ���������ṩ�ֽ������������
    // ʵ����һ�����л��湦�ܵ��ֽ�������ʱ��ֻ����FileInputStream����������һ��BufferedInputStream���󼴿ɡ�
    static void copyFile() throws IOException{
        FileInputStream fis = new FileInputStream("d:\\licence.txt");
        // ���л��湦�ܵ��ֽ�������
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("e:\\licence.txt");
        byte[] buffer = new byte[1024];
        while (bis.read(buffer, 0, buffer.length) != -1){
            fos.write(buffer);
        }
        fos.close();
        bis.close();
    }
}
