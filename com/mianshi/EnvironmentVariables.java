package com.mianshi;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * ��ȡos��������
 * @author Administrator
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        Properties properties = new Properties();
        InputStream resourceAsStream = EnvironmentVariables.class.getResourceAsStream("./ev.properties");
        try {
            properties.load(new InputStreamReader(resourceAsStream, "utf-8"));
            String key = "pwd";
            if (properties.containsKey(key)) {
                String property = properties.getProperty("pwd");
                System.out.println("======^_^======variable property value is : " + property + ", " + " current method and class name is : EnvironmentVariables.main()");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        // ͨ��system����
        String java_home = System.getenv("JAVA_HOME");

        System.out.println("======^_^======variable java_home value is : " + java_home + ", " + " current method and class name is : EnvironmentVariables.main()");

    }
}
