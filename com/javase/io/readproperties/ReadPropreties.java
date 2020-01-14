package com.javase.io.readproperties;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @Description 读取properties配置文件
 * @Author zohn
 * @Date 2020\1\14 0014 15:16
 * @Param 
 * @Return
 */
public class ReadPropreties {

    public static void main(String[] args) throws Exception{
        String jycs_d_yxfw = getDmb("jycs_d_yxfw");
        System.out.println("======^_^======变量jycs_d_yxfw值为: " + jycs_d_yxfw + ", " + "当前类以及方法名字是: ReadPropreties.main()");
    }

    public static String getDmb(String dmbm) throws Exception {
        Properties properties = new Properties();
        InputStream resourceAsStream = ReadPropreties.class.getResourceAsStream("./dmb.properties");
        try {
            properties.load(new InputStreamReader(resourceAsStream, "utf-8"));

            // 不是这个oh properties.contains(dmbm)
            // 是这个 properties.containsKey(dmbm)


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
