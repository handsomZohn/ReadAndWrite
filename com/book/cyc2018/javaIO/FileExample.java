package com.book.cyc2018.javaIO;

import java.io.File;

/**
 *@Description  �ݹ������һ��Ŀ¼�������ļ�
 *@CreateDate   18/07/18 9:58
 *@Author        zohn
 *@Version       1.0
 *
 */
public class FileExample {
    public static void main(String[] args) {
        // File�����ڱ�ʾ�ļ���Ŀ¼ ֻ���ڱ�ʾ�ļ�����Ϣ ����ʾ�ļ�������
        File dir = new File("d:/upload");
        listAllFiles(dir);
    }



    static void listAllFiles(File dir) {
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }
}
