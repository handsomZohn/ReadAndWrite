package com.javase.io.readproperties;

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
}
