package com.javase.dataType;

public class AboutStr {

	public static void main(String[] args) {
//		 tm1();
//		 tm2();
//		 tm3();
//		 tm4();
		 tm5();
	}

	static void tm1() {
		String name1 = "zhangyifeng";
		String name2 = "zhang" + "yifeng"; // �������Ż�Ϊ: name2 = "zhangyifeng";
		System.out.println(name1 == name2);// true
	}

	static void tm2() {
		String name1 = "zhangyifeng";
		String name2 = "zhang";
		String name3 = name2 + "yifeng"; // �����ڱ����ڼ��Ż� �����b+2�������泣���������
		System.out.println(name1 == name3);// false
	}

	static void tm3() {
		String name1 = "zhangyifeng";
		final String name2 = "zhang";
		String name3 = name2 + "yifeng";// ���ڱ�final���εı���������class�ļ��������б���һ��������Ҳ����˵����ͨ�����Ӷ����з��ʣ���final�����ķ����ڱ����ڼ䶼��ֱ�ӱ����Ϊ��ʵ��ֵ
		System.out.println(name1 == name3);// true
	}

	static void tm4() {
		String string = "hello2";
		final String string2 = getHello();
		String string3 = string2 + "2";	// string2��Ȼ��final����
										// ���������丳ֵ��ͨ���������÷��صģ���ô����ֵֻ���������ڼ�ȷ�������string��String3
										// ָ��Ĳ���ͬһ������
		System.out.println(string == string3);// false
	}

	static String getHello() {
		return "hello";
	}

	static void tm5() {
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = new String("hello");
		String str4 = str2.intern();// String.intern()
									// Java6֮ǰ��ȥ����ʱ�����ز�����û��������ͬ���ַ��������򷵻�ָ����ַ��������ã���������ڣ�
									// ��Ὣ���ַ�����أ�������һ��ָ����ַ��������á�

		System.out.println(str1 == str2);// false
		System.out.println(str2 == str3);// false
		System.out.println(str2 == str4);// false
		System.out.println(str1 == str4);// true
	}

	static void tm6() {
		// �������ٸ�����
		String string = new String("String");
		// newֻ������һ�Σ�Ҳ����˵ֻ������һ������
		// �������������� String str = new String("abc")�漰������String���󣿺���Ľ�����2����
		// �����Թ�ѯ�����������δ���ִ�й����д����˶��ٸ��������漰�����ٸ�����
	}

	static void tm7() {
		String str1 = "I";
		// str1 += "love"+"java"; 1)
		str1 = str1 + "love" + "java"; // 2)
		//��1)��Ч�ʱ�2)��Ч��Ҫ�ߣ�1)�е�"love"+"java"�ڱ����ڼ�ᱻ�Ż���"lovejava"����2)�еĲ��ᱻ�Ż���
		// ��1)��ֻ������һ��append����������2)�н���������append������
	}
}
