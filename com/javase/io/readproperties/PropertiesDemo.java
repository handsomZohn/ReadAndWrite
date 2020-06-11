package com.javase.io.readproperties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static final Properties p = new Properties();
    public static final String path = "./dmb.properties";

    /**
     * ͨ����װ���� ��ʼ��Properties
     */
    public static void init() {
        //ת������
        InputStream inputStream =
                PropertiesDemo.class.getClassLoader().getResourceAsStream(path);
        try {
            //���������ж�ȡ�����б�����Ԫ�ضԣ�
            p.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * �޸Ļ�������key
     * @param key
     * @param value
     */
    public static void update(String key, String value) {
        p.setProperty(key, value);
        FileOutputStream oFile = null;
        try {
            oFile = new FileOutputStream(path);
            //��Properties�е������б�����Ԫ�ضԣ�д�������
            p.store(oFile, "");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * ͨ��key��ȡvalue
     * @param key
     * @return
     */
    public static String get(String key) {
        return p.getProperty(key);
    }


    public static void main(String[] args) {
        init();
        String jycs_d_yxfw = get("jycs_d_yxfw");
        System.out.println("======^_^======variable jycs_d_yxfw value is : " + jycs_d_yxfw + ", " + " current method and class name is : PropertiesDemo.main()");
        update("jycs_d_yxfw", "jycs_d_yxfw");
        String jycs_d_yxfw1 = get("jycs_d_yxfw");
        System.out.println("======^_^======variable jycs_d_yxfw1 value is : " + jycs_d_yxfw1 + ", " + " current method and class name is : PropertiesDemo.main()");
    }
}
