package com.cyc2018.javaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *@Description  ʹ���ַ��������ļ�����
 *@CreateDate   18/07/18 14:55
 *@Author        zohn
 *@Version       1.0
 *
 */
public class CharacterCopyFileExample {
    public static void main(String[] args) throws IOException {
        String src = "d:\\licence.txt", dist = "e:\\licence.txt";
        System.out.println("�����ļ���ʼ��" + System.currentTimeMillis());
        copyFile(src,dist);
        System.out.println("�����ļ�������" + System.currentTimeMillis());
        readLine(src);
    }

    /**
     *
     * @param src ԭ�ļ�·��
     * @param dist Ŀ���ļ�·��
     * @throws IOException
     */
    static void copyFile(String src, String dist) throws IOException{
        FileReader fileReader = new FileReader(src);
        FileWriter fileWriter = new FileWriter(dist);
        char[] chuf = new char[20 * 1024];
        while (fileReader.read(chuf, 0, chuf.length) != -1){
            fileWriter.write(chuf);
        }
        fileWriter.close();
        fileReader.close();
    }

    /**
     * ��������ļ�����
     * @param src Դ�ļ�·��
     * @throws IOException
     */
    static void readLine(String src) throws  IOException{
        FileReader fileReader = new FileReader(src);
        // װ����ģʽʹ��BufferedReader���һ��FileReader����
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        // �ڵ���BufferedReader��close()����ʱ,��ȥ����FileReader��close()����
        // ֻ�����һ�μ���
        bufferedReader.close();
    }
    // ������ǰ��ַ�ת��Ϊ�ֽ� ������ǰ��ֽ�������ϳ��ַ�;
}
