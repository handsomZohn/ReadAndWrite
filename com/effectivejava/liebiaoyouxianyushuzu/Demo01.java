package com.effectivejava.liebiaoyouxianyushuzu;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public class Demo01 {
    public static void main(String[] args) {
        // fail at runtime
        // Object[] objectArray = new Long[1];
        //objectArray[0] = "I Don't fit in!";
        // Won't compile
        // List<Object> objectList = new ArrayList<Long>();
        // objectList.add("I don't fit in!");

        User user = null;
        user = new User();
        user.setName("21");
        try{
            String name = user.getName();
            System.out.println(name);
        } catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println("����������Ϣ");
        }

    }
}

class User{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}