package com.javase.io.readproperties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @Description ��ȡproperties�����ļ�
 * @Author zohn
 * @Date 2020\1\14 0014 15:16
 * @Param 
 * @Return
 */
public class ReadPropreties {

    public static void main(String[] args) throws Exception{
        String jycs_d_yxfw = getDmb("jycs_d_yxfw");
        System.out.println("======^_^======����jycs_d_yxfwֵΪ: " + jycs_d_yxfw + ", " + "��ǰ���Լ�����������: ReadPropreties.main()");

        // ����keyֵ�޸�value
        updateByKey("jycs_d_yxfw");

        String jycs_d_yxfw02 = getDmb("jycs_d_yxfw");
        System.out.println("======^_^======����jycs_d_yxfw02ֵΪ: " + jycs_d_yxfw02 + ", " + "��ǰ���Լ�����������: ReadPropreties.main()");
    }

    public static String getDmb(String dmbm) throws Exception {
        Properties properties = new Properties();
        InputStream resourceAsStream = ReadPropreties.class.getResourceAsStream("./dmb.properties");
        try {
            properties.load(new InputStreamReader(resourceAsStream, "utf-8"));

            // �������oh properties.contains(dmbm)
            // ����� properties.containsKey(dmbm)


            if (properties.containsKey(dmbm)) {
                String property = properties.getProperty(dmbm);
                return property;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * @Description 
     * @Author z
     * @Date 2020\6\11 0011 15:04
     * @Param [key]
     * @Return void
     */
    public static void updateByKey(String key) throws Exception{
        Properties properties = new Properties();
        InputStream resourceAsStream = ReadPropreties.class.getResourceAsStream("./dmb.properties");
        properties.load(new InputStreamReader(resourceAsStream, "utf-8"));
        properties.setProperty(key, "xg");
        FileOutputStream oFile = null;
        String path = "./dmb.properties";
        try {
            oFile = new FileOutputStream(path);
            //��Properties�е������б�����Ԫ�ضԣ�д�������
            properties.store(oFile, "");
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
}
