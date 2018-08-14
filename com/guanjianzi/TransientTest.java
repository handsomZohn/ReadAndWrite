package com.guanjianzi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientTest {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("zohn");
		user.setPassword("123456789");
		System.out.println("read before Serializable:");
		System.out.printf("username:%s", user.getUsername() + ", ");
		System.out.printf("password:%s", user.getPassword());
		
		// String string = "string";
		// System.out.
		// ("%s", string);// 1.4��֧��
		
		// ���л�
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/user.txt"));
			oos.writeObject(user);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// �����л�
		try {
			// �����л�֮ǰ����name��ֵ
			// User.username = "songminglu";// �����л�������static�ͱ���username��ֵΪ��ǰJVM�ж�Ӧstatic������ֵ
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/user.txt"));
				user = (User)ois.readObject();
				ois.close();
				System.out.println("\nread after Serializable:");
				System.out.printf("username:%s", user.getUsername() + ", ");
				System.out.printf("password:%s", user.getPassword());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String username; // static
	transient private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}