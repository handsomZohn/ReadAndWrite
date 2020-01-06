package com.book.cyc2018.javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @Description ָ�������ļ����Ϊzip
 * @CreateDate 18/08/08 10:43
 * @Author zohn
 * @Version 1.0
 */
public class ZipFiles {


    public static void main(String[] args) throws Exception {
        File[] srcFiles = {new File("E:\\AboutStr.java"), new File("E:\\licence.txt"), new File("E:\\user.txt")};
        File zipFile = new File("E:\\zipDemo.zip");
        zipFiles(srcFiles, zipFile);
    }

    /**
     * ��ָ�����ļ����Ϊzip
     *
     * @param srcFiels Դ�ļ���Ҫ���Ϊzip���ļ�
     * @param zipFile  zip�ļ�
     * @throws Exception
     */
    public static void zipFiles(File[] srcFiels, File zipFile) throws Exception {
        // ������ ����
        if (!zipFile.exists()) {
            zipFile.createNewFile();
        }

        // ����������
        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        FileInputStream fis = null;

        // ʵ����������
        fos = new FileOutputStream(zipFile);
        zos = new ZipOutputStream(fos);
        ZipEntry zipEntry = null;

        // ����Դ�ļ�����
        for (int i = 0; i < srcFiels.length; i++) {
            // ��Դ�ļ������еĵ�ǰ�ļ�����FileInputStream����
            fis = new FileInputStream(srcFiels[i]);
            // ʵ����ZipEntry ����Դ�ļ������еĵ�ǰ�ļ�
            zipEntry = new ZipEntry(srcFiels[i].getName());
            zos.putNextEntry(zipEntry);
            // �ñ�����¼ÿ��������ȡ���ֽڸ���
            int len;
            // ����ÿ�ζ�ȡ���ֽ�����
            byte[] buffer = new byte[1024];
            while ((len = fis.read(buffer)) > 0) {
                zos.write(buffer, 0, len);
            }
        }

        zos.closeEntry();
        zos.close();
        fis.close();
        fos.close();
    }

}
