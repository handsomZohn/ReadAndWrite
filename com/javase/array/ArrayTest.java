package com.javase.array;

public class ArrayTest {

	/**
	 * ���鶨���ʱ�� [] ���������� ��������������һ������--
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = getArray();
		String[] array1 = getArray();
		System.out.println(array1[0]);
		System.out.println(array[0]);
	}

	public static String[] getArray(){
		String[][] strArr = {{"00","01"},{"11","12"}};
		return strArr[0];
		
	
	}
}

class sfysm{
	public static void main(String[] args) {
		String sfysm = "110";
		System.out.println("{\"message\":\"sfysm\",\"sfysm\":\""+sfysm+"\"}");
		
		System.out.println("\"\"");
	}
}
