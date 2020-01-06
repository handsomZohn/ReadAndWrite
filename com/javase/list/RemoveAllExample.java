package com.javase.list;

import java.util.ArrayList;

/**
 * @Description: ����removeAll����
 * @Author: zohn
 * @CreateDate: 2019/1/24 19:59
 * @UpdateUser: zohn
 * @UpdateDate: 2019/1/24 19:59
 * @UpdateRemark: �޸�����
 * @Version: 1.0
 */
public class RemoveAllExample {


    public static void main(String[] args) {
        removeAllTest();
    }

    public static void removeAllTest() {
        ArrayList<User> userList01 = new ArrayList<>();
        ArrayList<User> userList02 = new ArrayList<>();

        // ������������ ���������ֵһģһ��
        User user01 = new User("username01", "01");
        User user02 = new User("username02", "02");

        // �ٴ����������� ���������ֵһģһ��
        User user03 = new User("username03", "03");
        User user04 = new User("username04", "04");

        // userList01�����
        userList01.add(user01);
        userList01.add(user02);
        userList01.add(user03);
        userList01.add(user04);

        // userList02�����
        // userList02.add(user03);// ��Ϊ�ǲ�ͬ�Ķ�����Ȼ���������ֵһģһ�� ���Ǿ����Ƴ�������
        // userList02.add(user04);// �ڴ��ַ����һ��λ��
        userList02.add(user01);
        userList02.add(user02);


        // ����userList01
        //userList01.forEach(System.out :: print);
        userList01.forEach(x ->
            System.out.println("username��" + x.getUsername() + "��age��" + x.getAge())
        );

        // remove
        boolean b = userList01.removeAll(userList02);
        System.out.println(b ? "�Ƴ��ɹ�" : "�Ƴ�ʧ��");
//        if (b) {
//
//        } else {
            userList01.forEach(x -> {
                System.out.println("username��" + x.getUsername() + " , age��" + x.getAge());
            });
//        }
    }
}

class User {
    private String username;
    private String age;

    public User(String username, String age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getAge() {
        return age;
    }
}
