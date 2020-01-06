package com.javaHightRanking.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InvokeMethod {

	/**
	 * ͨ������������еķ���
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			// ���䴴����ʵ�������ַ�ʽ
			Class<?> student = Class.forName("com.javaHightRanking.reflect.Student"); // 1����̬����
			student = Student.class; // 2�����þ�̬����
			Student stu = new Student();
			stu.setName("zhangyifeng");
			stu.setTel("15565668401");
			student = stu.getClass(); // 3������ʵ�������getClass();

			// ͨ��������ö���ķ���
			Method method = student.getMethod("printInfo"); // ��ȡ���� �����Ƿ���������
			method.invoke(student.newInstance()); // ͨ��ʵ�����÷���
			Method method2 = student.getMethod("printAddress", String.class); // �����Ƿ��������ֺ͸÷�������Ĳ�������
			method2.invoke(student.newInstance(), "��ׯСѧ");

			// �����ȡ�����ö���˽���ֶε�ֵ
			Field name = student.getDeclaredField("name");
			Field tel = student.getDeclaredField("tel");
			Field[] fields = student.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true); // ��һ������Ҫ false Class
											// com.reflect.InvokeMethod can not
											// access a member of class
											// com.reflect.Student with
											// modifiers "private"
				System.out.println(field.get(stu)); // ��ȡ��������
			}
			name.setAccessible(true);
			name.set(stu, "����"); // �޸�˽������
			tel.setAccessible(true);
			tel.set(stu, "18310834045");
			// �޸Ĺ����ֵ:
			System.out.println("�޸Ĺ����name����ֵ:" + name.get(stu));
			System.out.println("�޸Ĺ����tel����ֵ:" + tel.get(stu));
			Field[] fields2 = student.getDeclaredFields(); // fields2 �ڶ��������Ҳ��Ҫ �����õ�ͬһ�� ����Ҫ�ٴ�setAccessible()
															// setAccessible(true)
			for (Field field : fields2) {
				field.setAccessible(true);
				System.err.println(field.get(stu));
			}
			
			// 

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("�����쳣----����ʧ��----");
		} /*
		 * finally { System.out.println("���ǻᾭ����~~~"); }
		 */
	}

}
