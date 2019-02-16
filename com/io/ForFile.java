package com.io;

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

}
