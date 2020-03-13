package com.book.xdclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *@Description �ҳ�ĳĿ¼�µ�������Ŀ¼�Լ����ļ�����ӡ������̨��
 *@CreateDate 2020\3\13 0013 11:05
 *@Author zohn
 *@Version 1.0
 */
public class FileAPI {
    public static void main(String[] args) {

        List<String> paths = new ArrayList<>();

        getAllFilePaths(new File("D:\\zohn"), paths);

        for (String path : paths) {
            System.out.println(path);
        }
    }

    /**
     * @Description ��ȡ�����ļ���·��
     * @Author zohn
     * @Date 2020\3\13 0013 11:09
     * @Param [filePath, paths]
     * @Return void
     */
    private static void getAllFilePaths(File filePath, List<String> paths) {
        File[] files = filePath.listFiles();
        if (files == null) {
            return;
        }
        for (File f : files) {
            if (f.isDirectory()) {
                paths.add(f.getPath());
                getAllFilePaths(f, paths);// �ݹ����
            } else {
                paths.add(f.getPath());
            }
        }
    }
}
