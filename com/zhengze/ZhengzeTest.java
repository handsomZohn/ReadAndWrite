package com.zhengze;

public class ZhengzeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1102 2470024 0689000";
//		String regStr = "\\d+"; //�ȼ���\\d+
//		System.out.println(regStr.matches(str));
//		//���ַ���ȥmatches����
//		System.out.println(str.matches(regStr));
		str=str.replaceAll("[\\s*]", "-");
		System.out.println("dh gt".matches("\\s*\\w*"));
	}

}
