package com.string;

public class StringTest02 {

	public static void main(String[] args) {
//		System.out.print("aa\raa");
//		System.out.print("aa\naa");
//		System.out.println("aa\faa");
//		System.out.println("aa\taa");
//		System.out.println("aacII\b");
//		System.out.println("\\");
		// \r	�س�
		// \f 	��ҳ
		// \n 	����
		// \t	�Ʊ��
		// \	ת��
		// \b	���ʱ߽�
		
		
		ppdgkg();
	}
	
	// java ���� ƥ�����ո�
	public static void ppdgkg(){
		String str = "   ";
		String reg_str = "\\s*";
		System.out.println(str.matches(reg_str));
	}
}
