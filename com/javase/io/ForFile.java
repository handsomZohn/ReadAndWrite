package com.javase.io;

import org.junit.Test;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * @Description ����copy�ļ��ķ�ʽ
 * @CreateDate 18/10/24 14:13
 * @Author zohn
 * @Version 1.0
 */
public class ForFile {

    public static void main(String[] args) throws Exception {
      /*  File file = new File("e:/�˻���PWD.txt");
        FileInputStream fileInputStream = new FileInputStream("e:/�˻���PWD.txt");
        int i = fileInputStream.read();
        while (i != -1) {
            System.out.println(i);
        }
        fileInputStream.close();*/

        copyFileByStream(new File("e:/licence.txt"), new File("d:/�˻���PWD.txt"));
        copyFileByChannel(new File("e:/licence.txt"), new File("d:/�˻���PWD.txt"));
    }

    /**
     * @Description ͨ����ͳ��IO�ṩ����API��copy
     * @CreateDate 18/10/24 14:14
     * @Author zohn
     * @Version 1.0
     */
    public static void copyFileByStream(File source, File dest) throws IOException {
        try (
                InputStream inputStream = new FileInputStream(source);
                OutputStream outputStream = new FileOutputStream(dest)
        ) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }
    }

    /**
     * @Description ͨ��nio��channel��copy
     * @CreateDate 18/10/24 14:14
     * @Author zohn
     * @Version 1.0
     */
    public static void copyFileByChannel(File source, File dest) throws IOException {
        try (
                FileChannel sourceChannel = new FileInputStream(source).getChannel();
                FileChannel destChannel = new FileOutputStream(dest).getChannel()
        ) {
            for (long count = sourceChannel.size(); count > 0; ) {
                long transferred = sourceChannel.transferTo(sourceChannel.position(), count, destChannel);
                sourceChannel.position(sourceChannel.position() + transferred);
                count -= transferred;
            }

        }
    }

    /**
     * @Description try-with-resource  ��Ҫ�رյ���ԴֻҪʵ����java.lang.AutoCloseable���Ϳ���?�����ر�
     * try()??���Զ�������Դ�����ǵĹر�˳���������try()�������Դ�ȹر�
     * Ctrl + Alt + U �鿴һ��������м̳й�ϵ
     * @Author zohn
     * @Date 2020\3\13 0013 10:55
     * @Param []
     * @Return void
     */
    @Test
    public void copyFile(){
        try (
                FileInputStream fis = new FileInputStream("d:/practice.txt");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("e:/practice.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            int size;
            byte[] buf = new byte[1024];
            while ((size = bis.read(buf)) != -1) {
                bos.write(buf, 0, size);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
