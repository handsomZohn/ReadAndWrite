package com.javaHightRanking.jvm.classloaderandclassforname;

/**
 *@Description  classloader �� forName������
 *@CreateDate   18/07/31 17:49
 *@Author        zohn
 *@Version       1.0
 *
 */
public class ClassLoaderAndForNameExample {
    public static void main(String[] args) throws ClassNotFoundException {
        String wholeNameLine = "com.jvm.classloaderandclassforname.Line";
        String wholeNamePoint = "com.jvm.classloaderandclassforname.Point";
        System.out.println("�����ǲ���ClassLoader��Ч��");
        classLoaderTest(wholeNameLine,wholeNamePoint);
        System.out.println("-----------------------------------------------");
        System.out.println("�����ǲ���classForName��Ч��");
        classforNameTest(wholeNameLine,wholeNamePoint);
    }

    /**
     * classloader
     * @param wholeNameLine
     * @param wholeNamePoint
     * @throws ClassNotFoundException
     */
    private static void classLoaderTest(String wholeNameLine, String wholeNamePoint)  throws ClassNotFoundException {
        Class<?> line;
        Class<?> point;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        line = systemClassLoader.loadClass(wholeNameLine);
        point = systemClassLoader.loadClass(wholeNamePoint);
        System.out.println("line   " + line.getName());
        System.out.println("point  " + point.getName());
    }

    /**
     * class.forName
     * @param wholeNameLine
     * @param wholeNamePoint
     * @throws ClassNotFoundException
     */
    private static void classforNameTest(String wholeNameLine, String wholeNamePoint) throws ClassNotFoundException {
        Class line = Class.forName(wholeNameLine);
        Class point = Class.forName(wholeNamePoint);
        System.out.println("line  " + line.getName());
        System.out.println("line  " + point.getName());
    }
}
