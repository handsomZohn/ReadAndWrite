package com.javase.exception;

import java.util.Objects;

public class RequireNonNull {
    public static void main(String[] args) {
        User user = null;

        try {
            Objects.requireNonNull(user);
        } catch (NullPointerException e) {
            System.out.println("������Ϊ�յ��쳣~~~");
        }

        System.out.println(user.getName());
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
